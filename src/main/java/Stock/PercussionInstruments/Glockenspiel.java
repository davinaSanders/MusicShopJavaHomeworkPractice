package Stock.PercussionInstruments;

import Stock.Accessories.Bow;
import Stock.Accessories.Mallet;
import Stock.Instrument;
import Stock.InstrumentType;

public class Glockenspiel extends Instrument {

    private Mallet mallet;

    public Glockenspiel(String material, String colour, InstrumentType type, double wPrice, double rPrice, Mallet mallet){
        super(material, colour, type, wPrice, rPrice);
        this.mallet = mallet;
    }



}


