package refactoringToPattern.builder.pattern;


import refactoringToPattern.builder.TagNode;

public class UseBuilder {
    public TagNode builTagWithGoodDesign(){
        TagBuilder tagBuilder = new TagBuilder("activity");
        tagBuilder.addChildren("flavors");
        tagBuilder.addToParent("flavors", "flavor");
        return tagBuilder.getResult();
    }

}


