package introexceptionreadfiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private List<String> ingredients = new ArrayList<>();

    public List<String> getIngredients() {
        return ingredients;
    }

    public void addIngredients(Path path) {
        for (int i = 2; i < getRecipe(path).size(); i++) {
            String ingredient = getRecipe(path).get(i).split(" ")[2];
            ingredients.add(ingredient);
        }
//        for (String ingredient: getRecipe(path)) {
//            if (ingredient.matches("\\d.*")) {
//                ingredients.add(ingredient.split(" ")[2]);
//            }
//        }
    }

    private List<String> getRecipe(Path path) {
        try {
            return Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
    }
}
