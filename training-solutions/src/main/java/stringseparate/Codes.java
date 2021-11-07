package stringseparate;

import java.util.Arrays;
import java.util.List;

public class Codes {
    public static void main(String[] args) {
        List<String> codes = Arrays.asList("T57fbj", "5xtcu45", "f578GVHd", "4fhd4h", "4lk,.hd", "hgd5jh");
        Codes codeList = new Codes();
        System.out.println(codeList.getCodesStartWithLetter(codes));
    }


    public String getCodesStartWithLetter(List<String> codes) {
        StringBuilder codesStartWithAlphabetic = new StringBuilder("Betűvel kezdődő kódok: ");
        for (String code: codes) {
            if (Character.isAlphabetic(code.charAt(0))) {
                codesStartWithAlphabetic.append(code);
                codesStartWithAlphabetic.append(", ");
            }
        }
        codesStartWithAlphabetic.delete(codesStartWithAlphabetic.length() - 2, codesStartWithAlphabetic.length());
        return codesStartWithAlphabetic.toString();
    }
}
