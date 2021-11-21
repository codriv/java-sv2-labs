package introexceptionfirstexception;

import java.util.Arrays;
import java.util.List;

public class Message {
    public static void main(String[] args) {
        List<String> codedMessage = Arrays.asList("76", "101", "103", "121", "101", "110", "32", "115", "122", "233", "112", "32", "110", "97", "112", "111", "100", "33");
        StringBuilder message = new StringBuilder();
        for (String code: codedMessage) {
            message.append((char)Integer.parseInt(code));
//            System.out.print((char)Integer.parseInt(code));
        }
        System.out.println(message);

        List<String> anotherCodedMessage = Arrays.asList("69", "122", "32", "101", "103", "121", "32", "104", "105", "98", "225", "115", "32", "252", "122", "1O1", "110", "101", "116", "46");
//        1O1: O => 0
        StringBuilder anotherMessage = new StringBuilder();
        for (String code: anotherCodedMessage) {
            anotherMessage.append((char)Integer.parseInt(code));
        }
        System.out.println(anotherMessage);
    }
}
