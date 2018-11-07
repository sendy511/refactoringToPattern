package refactoringToPattern.builder.no_pattern;


import refactoringToPattern.builder.TagNode;

public class UseBuilder {
    public TagNode buildTagWithBadDesign(){
        TagNode activity = new TagNode("activity");
        TagNode flavors = new TagNode("flavors");
        TagNode flavor = new TagNode("flavor");

        activity.addChildren(flavors);
        flavors.addChildren(flavor);

        return activity;
    }
}

