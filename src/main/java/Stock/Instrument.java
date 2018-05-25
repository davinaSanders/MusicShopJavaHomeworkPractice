package Stock;

public abstract class Instrument implements IPlay, ISell {
    protected String material;
    protected String colour;
    protected InstrumentType type;
    protected double wPrice;
    protected double rPrice;

    public Instrument(String material, String colour, InstrumentType type, double wPrice, double rPrice){
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.wPrice = wPrice;
        this.rPrice = rPrice;

    }

    public String getMaterial() {
        return this.material;
    }

    public String getColour() {
        return this.colour;
    }

    public InstrumentType getType() {
        return this.type;
    }

    public double getWPrice() {
        return this.wPrice;
    }

    public double getRPrice() {
        return this.rPrice;
    }

}
