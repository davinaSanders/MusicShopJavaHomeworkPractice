package Stock.StringInstruments;

import Stock.Accessories.Bow;
import Stock.Instrument;
import Stock.InstrumentType;

public class Violin extends Instrument {
    private Bow bow;

    public Violin(String material, String colour, InstrumentType type, double wPrice, double rPrice, Bow bow){
        super(material, colour, type, wPrice, rPrice);
        this.bow = bow;
    }
}
