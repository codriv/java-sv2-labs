package methodchain;

public class ModifiedWord {

    public String modify(String word) {
        return word
            .replaceFirst(word.substring(0, 1), word.substring(0, 1).toUpperCase())
            .replaceFirst(word.substring(1, 2), "x")
            .replaceFirst(word.substring(2, 3), word.substring(2, 3).toUpperCase())
            .replaceFirst(word.substring(3), "y");
    }
}
