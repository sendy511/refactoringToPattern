package refactoringToPattern.decorator.no_pattern;

//
// Bad example
//

import refactoringToPattern.decorator.Translater;

class Client{
    public void parseHtml(){
        String rawHtmlNodeContent = "asdf&lt;111&rt;";
        StringNode stringNode = new StringNode(rawHtmlNodeContent, true);
        stringNode.toPlainTextString();
    }
}

class StringNode {
    private boolean shouldDecode;
    private String content;

    StringNode(String content, boolean shouldDecode){
        this.shouldDecode = shouldDecode;
        this.content = content;
    }

    String toPlainTextString(){
        if(this.shouldDecode){
            return Translater.decode(this.content);
        } else {
            return this.content;
        }
    }
}