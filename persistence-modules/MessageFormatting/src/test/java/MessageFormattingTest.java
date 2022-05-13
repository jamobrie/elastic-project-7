import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class MessageFormattingTest {

    private  String apple = "apple";
    private  String orange = "orange";
    private  String banana = "banana";
    private  String owl = "owl";

    @Test
    void formatTheMessageWithManyArgs() {
        MessageFormatting messageFormatting = new MessageFormatting();
        String actualMessage = messageFormatting.formatTheMessage(apple, orange, banana, owl);
        assertEquals("The fruit we have is: apple orange banana and we own an animal of owl", actualMessage);
    }

    @Test
    void testStringWithNewLine() {
        String jimmy = "This is Jimmy" + "\n" + "and this is after backslash n";
        assertEquals("This is Jimmy\n" +
                "and this is after backslash n", jimmy);

        StringBuilder jimmyBuilder = new StringBuilder();
        jimmyBuilder.append("I am Jimmy \n and I have a new line here");
        assertEquals("I am Jimmy \n and I have a new line here", jimmyBuilder.toString());
    }
}