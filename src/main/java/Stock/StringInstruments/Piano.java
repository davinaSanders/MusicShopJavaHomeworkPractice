package Stock.StringInstruments;

import Stock.Instrument;
import Stock.InstrumentType;

public class Piano extends Instrument {

    public Piano(String material, String colour, InstrumentType type, double wPrice, double rPrice){
        super(material, colour, type, wPrice, rPrice);
    }
}
