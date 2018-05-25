package Stock.StringInstruments;

import Stock.Instrument;
import Stock.InstrumentType;

public class Violin extends Instrument {

    public Violin(String material, String colour, InstrumentType type, double wPrice, double rPrice){
        super(material, colour, type, wPrice, rPrice);
    }
}
