package poo_fp11.PizzaRestaurant;

import java.util.ArrayList;

public class Pizza {

    private final int MAX_IGREDIENTS=5;
    private int id;
    private String name;
    private String description;
    private float price;
    private PizzaSize size;
    private ArrayList<PizzaIngredients> ingredients;
    private int numberOfIngredients;

    public Pizza(int id, String name, String description, float price, PizzaSize size, int numberOfIngredients){
        this.id=id;
        this.name=name;
        this.description=description;
        this.price=price;
        this.size=size;
        this.numberOfIngredients=numberOfIngredients;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfIngredients() {
        return numberOfIngredients;
    }

    public PizzaSize getSize() {
        return size;
    }

    public String getDescription() {
        return description;
    }

    public void addIngredient(String ingredient){

    }
}
