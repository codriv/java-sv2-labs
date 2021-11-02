package composition.realestate;

public class RealEstateDotCom {
    public static void main(String[] args) {
        RealEstate realEstate = new RealEstate("Családi ház", 26_000_000, new Details("4 szobás, 2 szintes kertes ház", new Address("Vác", "2600", "Rigó u.", 25), 200, 500));
        System.out.println(realEstate);

        realEstate.setPrice(32_000_000);
        System.out.println("\n" + realEstate);

        realEstate.getDetails().setDescription("3 szobás lakás");
        System.out.println("\n" + realEstate);

        realEstate.getDetails().getAddress().setCity("Sopron");
        System.out.println("\n" + realEstate);

        realEstate.getDetails().setAddress(new Address("Tata", "2890", "Váralja u.", 18));
        System.out.println("\n" + realEstate);

        realEstate.setDetails(new Details("2 szobás apartman", realEstate.getDetails().getAddress(), 60, 120 ));
        System.out.println("\n" + realEstate);
    }
}
