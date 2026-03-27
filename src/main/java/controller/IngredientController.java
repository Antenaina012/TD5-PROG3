package controller;
import entity.Ingredient;
import repository.IngredientRepository;
import java.util.List;


public class IngredientController {
    private IngredientRepository repository = new IngredientRepository();

    public List<Ingredient> getAllIngredients() throws Exception {
        return repository.findAll();
    }
}