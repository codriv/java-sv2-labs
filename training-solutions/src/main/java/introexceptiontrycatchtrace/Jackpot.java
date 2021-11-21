package introexceptiontrycatchtrace;

public class Jackpot {
    public static void main(String[] args) {
        Winner winner = new Winner();
        try {
            System.out.printf("A mai nyertes: %s", winner.getWinner());
        }
        catch (NullPointerException npe) {
            System.out.println(npe.getMessage());
        }
    }
}
