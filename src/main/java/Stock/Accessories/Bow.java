package Stock.Accessories;

public class Bow extends Accessory {
    private String origin;
    private int width;


    public Bow(double wPrice, double rPrice, AccessoryType type, String origin, int width){
        super(wPrice, rPrice, type);
        this.origin = origin;
        this.width = width;
    }
}
