package entity;

public class Ingredient {
    private int id;
    private String name;
    private double unitPrice;
    private String unit;

    public Ingredient(int id, String name, double unitPrice, String unit) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.unit = unit;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getUnitPrice() { return unitPrice; }
    public String getUnit() { return unit; }
}