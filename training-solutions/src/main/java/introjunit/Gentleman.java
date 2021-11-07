package introjunit;

public class Gentleman {

    public String sayHello(String name) {
        if (name != null) {
            return "Hello " + name;
        }
        return "Hello Anonymous";
    }
}

//    ternary operátorral a tesztlefedettségnél nem látszik, ha csak az egyik ág van tesztelve.
//    public String sayHello(String name) {
//        return "Hello " + (name == null ? "Anonymous" : name);
//    }