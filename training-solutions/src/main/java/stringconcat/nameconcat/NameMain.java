package stringconcat.nameconcat;

import java.util.Locale;

public class NameMain {
    public static void main(String[] args) {
        Name name = new Name("Nagy", "Sándor", "József", Title.MR);
        System.out.println(name.concatNameHungarianStyle());
        System.out.println(name.concatNameWesternStyle());
        Name name2 = new Name("Nagy", "Sándor", "József");
        System.out.println(name2.concatNameHungarianStyle());
        System.out.println(name2.concatNameWesternStyle());
        System.out.println();
        Name2 name3 = new Name2("Nagy", "Sándor", "József", Title2.MR);
        System.out.println(name3.concatNameHungarianStyle());
        System.out.println(name3.concatNameWesternStyle());
        Name2 name4 = new Name2("Nagy", "Sándor", "József");
        System.out.println(name4.concatNameHungarianStyle());
        System.out.println(name4.concatNameWesternStyle());


    }
}
