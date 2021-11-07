package references.dogs;

import java.util.ArrayList;
import java.util.List;

public class KennelVerbose {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        Dog dog1 = new Dog("Bodri", 5, "sötétbarna");
        Dog dog2 = new Dog("Bundás", 4, "szürke");
        Dog dog3 = new Dog("Bogáncs", 5, "fekete");
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        System.out.println("\nHozz létre egy üres List<Dog> dogs listát, amelyben az osztály a hozzá tartozó kutyákat fogja nyilvántartani!\n" +
                "Példányosíts három különböző Dog-ot, és mindhármat add hozzá a listához!\n" +
                "Írd ki a konzolra a lista tartalmát!");
//        System.out.println(" dogs: " + dogs);
        KennelVerbose kennelVerbose = new KennelVerbose();
        System.out.println(kennelVerbose.printOut(dogs));

        Dog dog4 = new Dog("Morzsa", 3, "Zsömle");
        dog4 = dogs.get(1);
        dog4.setColour("világosbarna");
        System.out.println("\nMajd definiálj egy új (negyedik) Dog típusú változót, amelynek add értékül a lista 1-es indexű elemét! A most definiált változónév használatával változtasd meg a kutya színét!\n" +
                "Újra írd ki a konzolra a lista tartalmát!");
//        System.out.println(" dogs: " + dogs);
        System.out.println(kennelVerbose.printOut(dogs));

        Dog dog5 = new Dog("pletyka", 2, "fehér");
        System.out.println("\nDefiniálj egy újabb (ötödik) Dog típusú változót, melynek adj értékül egy újonnan példányosított objektumot! Írd is ki a konzolra ennek a példánynak az adatait!");
        System.out.println(" dog5: " + dog5);
        dog5 = dogs.get(1);
        System.out.println("\nAz előző lépésben definiált változónak add értékül a kutyalista 1-es indexű elemét! Írd ki a konzolra a változó értékét!");
        System.out.println(" dog5: " + dog5);
        dogs.add(dog5);
        System.out.println("\nA listához add hozzá az előző változó által hivatkozott példányt! Írd ki a konzolra a lista tartalmát!");
//        System.out.println(" dogs: " + dogs);
        System.out.println(kennelVerbose.printOut(dogs));

        Dog dog6 = dog4;
        dog6.setColour("fekete-fehér");
        System.out.println("\nDefiniálj megint egy (hatodik) Dog típusú változót, majd add neki értékül a korábbi, negyedik Dog típusú változó értékét! A most definiált változó nevének használatával változtasd meg a kutya színét!\n" +
                "Újra írd ki a konzolra a lista tartalmát!");
//        System.out.println(" dogs: " + dogs);
        System.out.println(kennelVerbose.printOut(dogs));

        List<Dog> newDogs = dogs;
        Dog dog7 = dog4;
        dog7.setColour("foltos");
        System.out.println("\nDefiniálj egy második List<Dog> típusú listát, melynek add értékül az első listát!\n" +
                "Definiálj megint egy (hetedik) Dog típusú változót, majd ennek is add értékül a korábbi, negyedik Dog típusú változó értékét! A most definiált változó nevének használatával újra változtasd meg a kutya színét!\n" +
                "Újra írd ki a konzolra a lista tartalmát, immár a második List<Dog> típusú változó nevének használatával!");
//        System.out.println(" newDogs " + newDogs);
        System.out.println(kennelVerbose.printOut(newDogs));

        dog2.setColour("piros");
        System.out.println("\nAz eredetileg létrehozott, másodikként definiált Dog típusú változó nevének használatával változtasd meg a kutya színét! Írd ki újra a konzolra a lista tartalmát, a második List<Dog> típusú változó nevének használatával!");
//        System.out.println(" newDogs: " + newDogs);
        System.out.println(kennelVerbose.printOut(newDogs));

        dog2 = null;
        System.out.println("\nAz eredetileg létrehozott, másodikként definiált Dog típusú változó értékét változtasd meg null-ra! Írd ki újra a konzolra a lista tartalmát, a második List<Dog> típusú változó nevének használatával!");
//        System.out.println(" newDogs: " + newDogs);
        System.out.println(kennelVerbose.printOut(newDogs));

        Dog dog8 = dogs.get(1);
        dog8 = null;
        System.out.println("\nDefiniálj egy újabb (nyolcadik) Dog típusú változót, majd add neki értékül az első kutyalista 1-es indexű elemét! Majd állítsd át az értékét null-ra! Írd ki újra a konzolra a lista tartalmát, a második List<Dog> típusú változó nevének használatával!");
//        System.out.println(" newDogs: " + newDogs);
        System.out.println(kennelVerbose.printOut(newDogs));

        Dog dog9 = dogs.get(1);
        dog9.setColour("kek");
        System.out.println("\nDefiniálj egy utolsó (kilencedik) Dog típusú változót, majd add neki értékül az első lista 1-es indexű elemét! A most definiált változó nevének használatával változtasd meg a kutya színét! Írd ki újra a konzolra a lista tartalmát, a második List<Dog> típusú változó nevének használatával!");
//        System.out.println(" newDogs: " + newDogs);
        System.out.println(kennelVerbose.printOut(newDogs));

        }
        public String printOut(List<Dog> list){
            String lista = "";
            int nr = 0;
            for (Dog item: list) {
                lista += "\n " + nr + ": " + item;
                nr++;
            }
            return " " + lista.trim();
    }
}
