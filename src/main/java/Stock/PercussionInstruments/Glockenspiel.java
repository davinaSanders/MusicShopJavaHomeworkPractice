package Stock.PercussionInstruments;

import Stock.Instrument;
import Stock.InstrumentType;

public class Glockenspiel extends Instrument {

    public Glockenspiel(String material, String colour, InstrumentType type, double wPrice, double rPrice){
        super(material, colour, type, wPrice, rPrice);
    }

    public String play (String sound){
        return "I am playing " + sound;
    }

    public double calculateMarkup(){
        return this.getRPrice() - this.getWPrice();
    }

}


