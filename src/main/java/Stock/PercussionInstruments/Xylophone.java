package Stock.PercussionInstruments;

import Stock.Accessories.Bow;
import Stock.Accessories.Mallet;
import Stock.Instrument;
import Stock.InstrumentType;

public class Xylophone extends Instrument {

    private Mallet mallet;

    public Xylophone(String material, String colour, InstrumentType type, double wPrice, double rPrice, Bow bow){
        super(material, colour, type, wPrice, rPrice);
        this.mallet = mallet;
    }
}
