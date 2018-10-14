package refactoringToPattern.Decorator;

public class StringNode {
    private boolean shouldEncode;

    public StringNode(boolean shouldEncode){
        this.shouldEncode = shouldEncode;
    }

    // Bad One
    public void toPlainTextString(){

    }

}
