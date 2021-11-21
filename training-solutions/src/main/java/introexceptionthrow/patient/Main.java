package introexceptionthrow.patient;

public class Main {
    public static void main(String[] args) {
        String ssn = "123456788";
        int sumOfNumbers = 0;
        for ( int i = 0; i < 8; i++) {
            int charValue = (Integer.parseInt(String.valueOf(ssn.charAt(i))));
            if (i % 2 == 0) {
                System.out.println(ssn.charAt(i));
                System.out.println(charValue * 3);
                sumOfNumbers += (charValue * 3);
            } else {
                System.out.println(ssn.charAt(i));
                System.out.println(charValue * 7);
                sumOfNumbers += (charValue * 7);
            }
        }
        System.out.println(sumOfNumbers);
    }
}
