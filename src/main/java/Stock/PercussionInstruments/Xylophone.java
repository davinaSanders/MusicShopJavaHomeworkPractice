package Stock.PercussionInstruments;

import Stock.Accessories.Bow;
import Stock.Instrument;
import Stock.InstrumentType;

public class Xylophone extends Instrument {

    private Bow bow;

    public Xylophone(String material, String colour, InstrumentType type, double wPrice, double rPrice, Bow bow){
        super(material, colour, type, wPrice, rPrice);
        this.bow = bow;
    }
}
