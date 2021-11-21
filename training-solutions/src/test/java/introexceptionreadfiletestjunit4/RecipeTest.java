package introexceptionreadfiletestjunit4;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class RecipeTest {
    Recipe recipe = new Recipe();
    Path path = Paths.get("src/test/resources/introexceptionreadfiletestjunit4/recipe.txt");
    Path wrongPath = Paths.get("wrongPath/recipe.txt");

    @Test
    public void addIngredientsTest() {
        recipe.addIngredients(path);
        List<String> ingredients = recipe.getIngredients();
        assertEquals(10, ingredients.size());
        assertEquals("citrom", ingredients.get(4));
    }

    @Test
    public void addIngredientsTestWithException() {
        IllegalStateException exception = assertThrows(IllegalStateException.class,
                () -> recipe.addIngredients(wrongPath));
        assertEquals("Can not read file!", exception.getMessage());
    }
}