package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {
        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix + name;
        System.out.println("prefix = " + prefix);
        System.out.println("name = " + name);
        System.out.println("message = " + message);
        message = message + 444;
        boolean b = message.equals("Hello John Doe");
        boolean c = message.equals("Hello John Doe444");
        System.out.println("message = " + message);
        System.out.println("b = " + b + " (\"" + message + "\" = \"Hello John Doe\")");
        System.out.println("c = " + c + " (\"" + message + "\" = \"Hello John Doe444\")");
        String empty1 = "";
        String empty2 = "";
        String concat = empty1 + empty2;
        System.out.println(concat);
        System.out.println("Összefűzött két üres String hossza: " + concat.length());
        System.out.println("Az \"Abcde\" String hossza: " + "Abcde".length());
        System.out.println("Az \"Abcde\" String 1. és 3. karaktere: " + "Abcde".substring(0, 1) + ", " + "Abcde".substring(2, 3));
        System.out.println("Az \"Abcde\" String 1-3. karaktere: " + "Abcde".substring(0, 3));
    }
}
