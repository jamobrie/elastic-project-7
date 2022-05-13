import java.util.Arrays;

public class MessageFormatting {

    //Interesting way to pass many Strings in
    public String formatTheMessage(String... abc) {
        return String.format("The fruit we have is: %s %s %s and we own an animal of %s", abc);
    }

}
