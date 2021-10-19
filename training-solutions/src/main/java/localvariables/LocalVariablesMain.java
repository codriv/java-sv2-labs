package localvariables;

public class LocalVariablesMain {
    public static void main(String[] args) {
        boolean b;
        // System.out.println("b = " + b);  Értékadás előtt nem tudja használni a System.out.println metódus!
        b = false;
        System.out.println("b = " + b);

        int a = 2;
        System.out.println("a = " + a);

        int i = 3;
        int j = 4;
        int k = i;
        System.out.println("i = " + i + "\r\nj = " + j + "\r\nk = i = " + k);

        String s = "Hello World!";
        System.out.println("s = " + s);

        String t = s;
        System.out.println("t = s = " + t);

        {
            int x = 0;
            System.out.println("x = " + x);
            System.out.println("a = " + a);
        }

        // System.out.println(x);   A blokkon belül definiált változó blokkon kívül nem látható!
    }
}
