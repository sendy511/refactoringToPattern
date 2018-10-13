package refactoringToPattern.builder;


public class UseBuilder {
    // BadOne
    public TagNode buildTagWithBadDesign(){
        TagNode activity = new TagNode("activity");
        TagNode flavors = new TagNode("flavors");
        TagNode flavor = new TagNode("flavor");

        activity.addChildren(flavors);
        flavors.addChildren(flavor);

        return activity;
    }

    //Goodone
    public TagNode builTagWithGoodDesign(){
        TagBuilder tagBuilder = new TagBuilder("activity");
        tagBuilder.addChildren("flavors");
        tagBuilder.addToParent("flavors", "flavor");
        return tagBuilder.getResult();
    }
}

class TagBuilder {
    private TagNode rootNode;
    public TagBuilder(String rootNodeName){
        rootNode = new TagNode(rootNodeName);
    }

    public void addChildren(String nodeName){
        rootNode.addChildren(new TagNode(nodeName));
    }

    public void addToParent(String parentNodeName, String childNodeName) {
        TagNode childNode = new TagNode(childNodeName);
        TagNode parentNode = getNode(this.rootNode, parentNodeName);
        if(parentNode != null){
            parentNode.addChildren(childNode);
        }
    }

    private TagNode getNode(TagNode tagNode, String nodeName){
        if(tagNode.getName().equals(nodeName)){
            return tagNode;
        } else {
            for(TagNode node : tagNode.getChildren()){
                if(getNode(node, nodeName) != null){
                    return node;
                };
            }
        }
        return null;
    }

    public TagNode getResult() {
        return this.rootNode;
    }
}