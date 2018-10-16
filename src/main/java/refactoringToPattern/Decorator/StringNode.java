package refactoringToPattern.Decorator;

//
// Bad example
//

class Client{
    public void parseHtml(){
        String rawHtmlNodeContent = "asdf&lt;111&rt;";
        StringNode stringNode = new StringNode(rawHtmlNodeContent, true);
        stringNode.toPlainTextString();
    }
}

class Translater{
    static String decode(String originalContent){
        return originalContent
            .replace("&lt;", "<")
            .replace("&rt;", ">");
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