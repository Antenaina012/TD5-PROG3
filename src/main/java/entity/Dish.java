package entity;
import java.util.List;

public class Dish {
    private int id;
    private String name;
    private double salePrice;
    private List<Ingredient> ingredients;

    public Dish(int id, String name, double salePrice, List<Ingredient> ingredients) {
        this.id = id;
        this.name = name;
        this.salePrice = salePrice;
        this.ingredients = ingredients;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalePrice() { return salePrice; }
    public List<Ingredient> getIngredients() { return ingredients; }
}