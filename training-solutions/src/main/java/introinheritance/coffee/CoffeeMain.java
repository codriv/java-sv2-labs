package introinheritance.coffee;

public class CoffeeMain {
    public static void main(String[] args) {

        Coffee coffee = new Coffee();
        coffee.setName("Black");
        coffee.setPrice(250);
        System.out.println(coffee.getName());
        System.out.println(coffee.getPrice());

        Cappuccino cappuccino = new Cappuccino();
        cappuccino.setName("Kapuccsino");
        cappuccino.setPrice(350);
        System.out.println(cappuccino.getName());
        System.out.println(cappuccino.getPrice());
    }

}
