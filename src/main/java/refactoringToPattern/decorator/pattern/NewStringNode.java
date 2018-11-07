package refactoringToPattern.decorator.pattern;

//
// Good example
//

import refactoringToPattern.decorator.Translater;

class NewClient {
    public void parseHtml() {
        String rawHtmlNodeContent = "asdf&lt;111&rt;";
        NewStringNode stringNode = new DecodedNewStringNode(
            new NewStringNode(rawHtmlNodeContent)
        );
        stringNode.toPlainTextString();
    }
}

class NewStringNode {

    private String content;

    NewStringNode(){}

    NewStringNode(String content) {
        this.content = content;
    }

    String toPlainTextString() {
        return this.content;
    }
}

class DecodedNewStringNode extends NewStringNode {

    private NewStringNode stringNode;

    public DecodedNewStringNode(NewStringNode stringNode) {
        this.stringNode = stringNode;
    }

    String toPlainTextString() {
        return Translater.decode(this.stringNode.toPlainTextString());
    }
}