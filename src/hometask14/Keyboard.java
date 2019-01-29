package hometask14;

public class Keyboard {

    private static String colour = "black";
    private static String producer = "ASUS";

    private int keys = 105;
    int size;
    public boolean backlighting; // ON = true; OFF = false
    private String keyColour = "White";


    public void setBacklight() {
        backlighting = !backlighting;
        System.out.println(backlighting);
    }
    private void setKeys() {
        keys = 100;
        System.out.println(keys);
    }


}
