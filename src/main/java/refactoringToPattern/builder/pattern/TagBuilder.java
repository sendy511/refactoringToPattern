package refactoringToPattern.builder.pattern;

import refactoringToPattern.builder.TagNode;

public  class TagBuilder {
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
