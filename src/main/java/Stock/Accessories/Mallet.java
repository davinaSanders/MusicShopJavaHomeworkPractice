package Stock.Accessories;

public class Mallet extends Accessory {
    private String colour;
    private int length;


    public Mallet(double wPrice, double rPrice, AccessoryType type, String colour, int length){
        super(wPrice, rPrice, type);
        this.colour = colour;
        this.length = length;
    }
}
