/**
 * @Author: Denislav Merkov
 * @Date of Completion: 26/4/2024
 * Student ID: 23020897
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.util.ArrayList;

/**
 * GadgetShop class
 */
public class GadgetShop implements ActionListener {
    private JFrame frame;
    private ArrayList<Gadget> gadgets;

    // Labels for GUI components
    private JLabel modelLabel;
    private JLabel priceLabel;
    private JLabel weightLabel;
    private JLabel sizeLabel;
    private JLabel creditLabel;
    private JLabel memoryLabel;
    private JLabel phoneNoLabel;
    private JLabel durationLabel;
    private JLabel downloadLabel;
    private JLabel displayNumberLabel;
    private JLabel madeByLabel;

    // TextFields for GUI components
    private JTextField ModelTextField;
    private JTextField PriceTextField;
    private JTextField WeightTextField;
    private JTextField SizeTextField;
    private JTextField CreditTextField;
    private JTextField MemoryTextField;
    private JTextField PhoneNoTextField;
    private JTextField DurationTextField;
    private JTextField DownloadTextField;
    private JTextField DisplayNumberTextField;

    // Buttons for GUI components
    private JButton mobileButton;
    private JButton mp3Button;
    private JButton clearButton;
    private JButton displayAllButton;
    private JButton makeACallButton;
    private JButton downloadMusicButton;

    /**
     *  Main method to start the program without BlueJ
     */ 
    public static void main(String[] args) {
        GadgetShop gadgetShop = new GadgetShop();
    }

    /**
     * Constructor to initialize the GUI components and ArrayList
     */ 
    public GadgetShop() {
        /**
         * JFrame and layout
         */ 
        frame = new JFrame("GadgetShop");
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new GridLayout(7, 4));
        contentPane.setBackground(Color.WHITE);

        /**
         * Initialize GUI labels, text fields, and buttons
         */ 
        initializeComponents();

        /**
         * action listeners to buttons
         */ 
        mobileButton.addActionListener(this);
        mp3Button.addActionListener(this);
        clearButton.addActionListener(this);
        displayAllButton.addActionListener(this);
        makeACallButton.addActionListener(this);
        downloadMusicButton.addActionListener(this);
        
        /**
         * nitialize gadgets ArrayList
         */
        gadgets = new ArrayList<>();

        /**
         * Pack and display the frame
         */
        frame.pack();
        frame.setVisible(true);
    }

    /**
     * Method to initialize GUI components
     */ 
    public void initializeComponents() {
        /**
         * Initialize labels
         */
        Font labelFont = new Font("Calibri", Font.PLAIN, 14);
        modelLabel = new JLabel("Model:");
        modelLabel.setFont(labelFont);
        modelLabel.setForeground(Color.BLACK);
        priceLabel = new JLabel("Price:");
        priceLabel.setFont(labelFont);
        priceLabel.setForeground(Color.BLACK);
        weightLabel = new JLabel("Weight:");
        weightLabel.setFont(labelFont);
        weightLabel.setForeground(Color.BLACK);
        sizeLabel = new JLabel("Size:");
        sizeLabel.setFont(labelFont);
        sizeLabel.setForeground(Color.BLACK);
        creditLabel = new JLabel("Credit:");
        creditLabel.setFont(labelFont);
        creditLabel.setForeground(Color.BLACK);
        memoryLabel = new JLabel("Memory:");
        memoryLabel.setFont(labelFont);
        memoryLabel.setForeground(Color.BLACK);
        phoneNoLabel = new JLabel("Phone Number:");
        phoneNoLabel.setFont(labelFont);
        phoneNoLabel.setForeground(Color.BLACK);
        durationLabel = new JLabel("Duration:");
        durationLabel.setFont(labelFont);
        durationLabel.setForeground(Color.BLACK);
        downloadLabel = new JLabel("Download:");
        downloadLabel.setFont(labelFont);
        downloadLabel.setForeground(Color.BLACK);
        displayNumberLabel = new JLabel("Display Number:");
        displayNumberLabel.setFont(labelFont);
        displayNumberLabel.setForeground(Color.BLACK);
        madeByLabel = new JLabel("Made by D.Merkov");
        madeByLabel.setFont(labelFont);
        madeByLabel.setForeground(Color.BLACK);

        /**
         * Initialize text fields
         */
        Font textFieldFont = new Font("Calibri", Font.PLAIN, 14);
        LineBorder textFieldBorder = new LineBorder(Color.BLACK);
        ModelTextField = new JTextField(15);
        ModelTextField.setBorder(textFieldBorder);
        ModelTextField.setFont(textFieldFont);
        PriceTextField = new JTextField(15);
        PriceTextField.setBorder(textFieldBorder);
        PriceTextField.setFont(textFieldFont);
        WeightTextField = new JTextField(15);
        WeightTextField.setBorder(textFieldBorder);
        WeightTextField.setFont(textFieldFont);
        SizeTextField = new JTextField(15);
        SizeTextField.setBorder(textFieldBorder);
        SizeTextField.setFont(textFieldFont);
        CreditTextField = new JTextField(15);
        CreditTextField.setBorder(textFieldBorder);
        CreditTextField.setFont(textFieldFont);
        MemoryTextField = new JTextField(15);
        MemoryTextField.setBorder(textFieldBorder);
        MemoryTextField.setFont(textFieldFont);
        PhoneNoTextField = new JTextField(15);
        PhoneNoTextField.setBorder(textFieldBorder);
        PhoneNoTextField.setFont(textFieldFont);
        DurationTextField = new JTextField(15);
        DurationTextField.setBorder(textFieldBorder);
        DurationTextField.setFont(textFieldFont);
        DownloadTextField = new JTextField(15);
        DownloadTextField.setBorder(textFieldBorder);
        DownloadTextField.setFont(textFieldFont);
        DisplayNumberTextField = new JTextField(15);
        DisplayNumberTextField.setBorder(textFieldBorder);
        DisplayNumberTextField.setFont(textFieldFont);

    
        /**
         * Initialize buttons
         */
        mobileButton = new JButton("Add Mobile");
        mobileButton.setBackground(new Color(135, 206, 250));
        mp3Button = new JButton("Add MP3");
        mp3Button.setBackground(new Color(135, 206, 250));
        clearButton = new JButton("Clear");
        clearButton.setBackground(new Color(135, 206, 250));
        displayAllButton = new JButton("Display All");
        displayAllButton.setBackground(new Color(135, 206, 250));
        makeACallButton = new JButton("Make A Call");
        makeACallButton.setBackground(new Color(135, 206, 250));
        downloadMusicButton = new JButton("Download Music");
        downloadMusicButton.setBackground(new Color(135, 206, 250));

        /**
         * Components to content pane
         */
        Container contentPane = frame.getContentPane();
        contentPane.add(modelLabel);
        contentPane.add(priceLabel);
        contentPane.add(weightLabel);
        contentPane.add(sizeLabel);
        contentPane.add(ModelTextField);
        contentPane.add(PriceTextField);
        contentPane.add(WeightTextField);
        contentPane.add(SizeTextField);
        contentPane.add(creditLabel);
        contentPane.add(memoryLabel);
        contentPane.add(mobileButton);
        contentPane.add(mp3Button);
        contentPane.add(CreditTextField);
        contentPane.add(MemoryTextField);
        contentPane.add(clearButton);
        contentPane.add(displayAllButton);
        contentPane.add(phoneNoLabel);
        contentPane.add(durationLabel);
        contentPane.add(downloadLabel);
        contentPane.add(displayNumberLabel);
        contentPane.add(PhoneNoTextField);
        contentPane.add(DurationTextField);
        contentPane.add(DownloadTextField);
        contentPane.add(DisplayNumberTextField);
        contentPane.add(makeACallButton);
        contentPane.add(downloadMusicButton);
        contentPane.add(madeByLabel);
    }

    /**
     * ActionPerformed method to handle button clicks in GUI application
     */
    
    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();
        switch (command) {
            case "Add Mobile":
                addMobile();
                break;
            case "Add MP3":
                addMP3();
                break;
            case "Display All":
                displayAll();
                break;
            case "Make A Call":
                makeACall();
                break;
            case "Download Music":
                downloadMusic();
                break;
            case "Clear":
                clear();
                break;
            default:
                break;
        }
    }
    
    /**
     * Method for Displaying all numbers from Graphic User Interface.
     */
    public int getDisplayNumberFromGUI() {
    return Integer.parseInt(DisplayNumberTextField.getText());
    }
    
    /**
     * Method to add a new Mobile gadget
     */ 
    
    public void addMobile() {
        String model = ModelTextField.getText();
        String priceText = PriceTextField.getText();
        String weightText = WeightTextField.getText();
        String size = SizeTextField.getText();
        String creditText = CreditTextField.getText();

        if (model.isEmpty() || priceText.isEmpty() || weightText.isEmpty() || size.isEmpty() || creditText.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Please fill in all the fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        double price;
        int weight;
        int credit;
        try {
            price = Double.parseDouble(priceText);
            weight = Integer.parseInt(weightText);
            credit = Integer.parseInt(creditText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Invalid input format for price, weight, or credit.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Create and add Mobile object
        Mobile mobile = new Mobile(model, price, weight, size, credit);
        gadgets.add(mobile);
    }

    /**
     * Method to add a new MP3 gadget
     */ 
    public void addMP3() {
        String model = ModelTextField.getText();
        String priceText = PriceTextField.getText();
        String weightText = WeightTextField.getText();
        String size = SizeTextField.getText();
        String memoryText = MemoryTextField.getText();

        
        if (model.isEmpty() || priceText.isEmpty() || weightText.isEmpty() || size.isEmpty() || memoryText.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Please fill in all the fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        
        double price;
        int weight;
        int memory;
        try {
            price = Double.parseDouble(priceText);
            weight = Integer.parseInt(weightText);
            memory = Integer.parseInt(memoryText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Invalid input format for price, weight, or memory.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Create and add MP3 object
        MP3 mp3 = new MP3(model, price, weight, size, memory);
        gadgets.add(mp3);
    }

    /**
     * Method to display all gadgets
     */ 
    public void displayAll() {
        for (int i = 0; i < gadgets.size(); i++) {
            Gadget gadget = gadgets.get(i);
            System.out.println("Gadget Number " + i);
            System.out.println("Model: " + gadget.getModel());
            System.out.println("Price: " + gadget.getPrice());
            System.out.println("Weight: " + gadget.getWeight());
            System.out.println();
        }
    }

    /**
     * Method to make a call using a Mobile gadget
     */ 
    public void makeACall() {
        int displayNumber = Integer.parseInt(DisplayNumberTextField.getText());
        if (displayNumber >= 0 && displayNumber < gadgets.size()) {
            if (gadgets.get(displayNumber) instanceof Mobile) {
                Mobile mobile = (Mobile) gadgets.get(displayNumber);
                mobile.makeACall(PhoneNoTextField.getText(), Integer.parseInt(DurationTextField.getText()));
            } else {
                JOptionPane.showMessageDialog(frame, "Selected gadget is not a mobile phone.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(frame, "Please enter a valid gadget number", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Method to download music using an MP3 gadget
     */ 
    
    public void downloadMusic() {
    int displayNumber = Integer.parseInt(DisplayNumberTextField.getText());
    if (displayNumber >= 0 && displayNumber < gadgets.size()) {
        if (!DownloadTextField.getText().isEmpty()) {
            try {
                MP3 mp3 = (MP3) gadgets.get(displayNumber);
                mp3.insertDownload(Integer.parseInt(DownloadTextField.getText()));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(frame, "Please enter a valid download size", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(frame, "Please enter a download size", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(frame, "Please enter a valid gadget number", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }


    /**
     * Method to clear text fields
     */
    public void clear() {
        ModelTextField.setText("");
        PriceTextField.setText("");
        WeightTextField.setText("");
        SizeTextField.setText("");
        CreditTextField.setText("");
        MemoryTextField.setText("");
        PhoneNoTextField.setText("");
        DurationTextField.setText("");
        DownloadTextField.setText("");
        DisplayNumberTextField.setText("");
    }

}





