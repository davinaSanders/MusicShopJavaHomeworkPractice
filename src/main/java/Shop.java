package Stock;

import Stock.*;

import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;

    public Shop(){
        this.stock = new ArrayList<>();

    }

    public int getStockCount() {
        return this.stock.size();
    }

    public void addStock(ISell object){
        this.stock.add(object);
    }

    public void removeStock(ISell instrument){
        this.stock.remove(instrument);
    }

    public void applyDiscount(ISell instrument){
        instrument.setDiscountPrice();
    }


}
