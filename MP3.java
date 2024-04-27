/**
 * @Author: Denislav Merkov
 * @Date of completion: 20/04/2024
 * Student ID: 23020897
 */


/**
 * This class represent an MP3 gadget. 
 * It Contains a variable "memory" to store the memory of mp3 gadget.
 */
public class MP3 extends Gadget {
    private int memory;

    /**
     * Constructor
     */
    public MP3(String model, double price, int weight, String size, int memory) {
        super(model, price, weight, size);
        this.memory = memory;
    }

    /**
     * Getter and setter for Memory
     */
    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    /**
     * Method to insert download
     */ 
    public void insertDownload(int downloadSize) {
        System.out.println("Downloading music of size " + downloadSize + " MB...");
    }
}
