package refactoringToPattern;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import refactoringToPattern.builder.pattern.UseBuilder;

class UseBuilderTest {

    @Test
    void should_be_ok() {
        assertTrue(true);
    }

    @Test
    void buildTagNode() {
    }

    @Test
    void builTagNodeGood() {
        UseBuilder useBuilder = new UseBuilder();
        useBuilder.builTagWithGoodDesign();
    }
}