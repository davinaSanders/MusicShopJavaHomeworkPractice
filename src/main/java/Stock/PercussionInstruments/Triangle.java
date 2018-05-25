package Stock.PercussionInstruments;

import Stock.Accessories.Mallet;
import Stock.Instrument;
import Stock.InstrumentType;

public class Triangle extends Instrument {

    private Mallet mallet;

    public Triangle(String material, String colour, InstrumentType type, double wPrice, double rPrice, Mallet mallet){
        super(material, colour, type, wPrice, rPrice);
        this.mallet = mallet;
    }


}
