package refactoringToPattern.decorator;

public class Translater{
    public static String decode(String originalContent){
        return originalContent
            .replace("&lt;", "<")
            .replace("&rt;", ">");
    }
}
