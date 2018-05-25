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

    public double getTotalProfit() {
        double totalProfit = 0;
        for (ISell item : this.stock){
            totalProfit += item.calculateMarkup();
        }
        return totalProfit;
    }

    public double getTotalDiscountProfit() {
        double totalDiscountProfit = 0;
        for (ISell item : this.stock){
            applyDiscount(item);
            totalDiscountProfit += item.calculateMarkup();
        }
        return totalDiscountProfit;
    }
}
