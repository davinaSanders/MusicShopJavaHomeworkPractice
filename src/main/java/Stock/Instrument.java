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

    public double getDiscountPrice(){
        return this.rPrice * 0.8;
    }

    public void setDiscountPrice() {
        this.rPrice = getDiscountPrice();
    }

    public String play (String sound){
        return "I am playing " + sound;
    }

    public double calculateMarkup(){
        return this.getRPrice() - this.getWPrice();
    }

}
