/** @Author: Denislav Merkov
 * @Date of completion: 20/04/2024
 * @Student ID: 23020897
 */

/**
 * This class represent a mobile device which extends to Gadget Class. 
 * Encapsulates the attributes and behaviour of a mobile device providing methods to acces and perform actions like making a calls
 */

/**
 * The main purpose of the Mobile class is representing a mobile device in the gadget shop.
 * Inheritance extends Mobile class and showing that a mobile device is a type of gadget.
 */
public class Mobile extends Gadget {
    private int credit;

    /** Constructor
    /*
     * The constructor builds a new Mobile Object with the characteristics specified. 
     */
    public Mobile(String model, double price, int weight, String size, int credit) {
        super(model, price, weight, size);
        this.credit = credit;
    }

    /**
     * Method to getCredit
     */ 
    
     public int getCredit() {
        return credit;
    }
    
    /**
     * Method to set Credit
     */
     
    public void setCredit(int credit) {
        this.credit = credit;
    }

    /**
     * Method to make a call
     */
    public void makeACall(String phoneNumber, int duration) {
        // Logic to make a call
        System.out.println("Making a call to " + phoneNumber + " for " + duration + " minutes...");
    }
}
