/**
 * @Author: Denislav Merkov
 * @Date of completion: 20/04/2024
 * Student ID: 23020897
 */
/**
 * This is a Main Class/Super for the GadgetProject-coursework.
 * 
 */
public class Gadget {
    
    private String model;
    private double price;
    private int weight;
    private String size;

    /**
     * Constructor method- the role of this class is to establish new examples of gadgets.
     * It is capable for pleace initial values for the assign new objects when are creted.
     */ 
    public Gadget(String model, double price, int weight, String size) {
        this.model = model;
        this.price = price;
        this.weight = weight;
        this.size = size;
    }

    /**
     * Get Model method 
     */
    
    public String getModel() {
        return model;
    }

    /**
     * Get Price method
     */
    public double getPrice() {
        return price;
    }

    /**
     * Get Weight method
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Get Size method
     */
    public String getSize() {
        return size;
    }
}