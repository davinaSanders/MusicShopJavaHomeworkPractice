import Stock.Accessories.AccessoryType;
import Stock.Accessories.Mallet;
import Stock.InstrumentType;
import Stock.PercussionInstruments.Glockenspiel;
import Stock.PercussionInstruments.Triangle;
import Stock.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Glockenspiel glockenspiel;
    Triangle triangle;
    Mallet mallet;

    @Before
    public void before(){
        shop = new Shop();
        glockenspiel = new Glockenspiel("titanium", "blue", InstrumentType.PERCUSSION, 20.20, 100, mallet);
        triangle = new Triangle("steel", "silver", InstrumentType.PERCUSSION, 12.00, 15.00, mallet);
        mallet = new Mallet(15, 20, AccessoryType.MALLET, "Aqua", 12);
    }

    @Test
    public void canAddStock(){
        shop.addStock(glockenspiel);
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void canRemoveStock(){
        shop.addStock(glockenspiel);
        shop.addStock(triangle);
        shop.removeStock(glockenspiel);
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void canApplyDiscount() {
        shop.applyDiscount(glockenspiel);
        assertEquals(80, glockenspiel.getRPrice(), 1);

    }

    @Test
    public void canGetTotalProfit(){
        shop.addStock(glockenspiel);
      assertEquals(79.8, shop.getTotalProfit(), 1);
    }

    @Test
    public void canGetTotalDiscountProfit__triangle(){
        shop.addStock(triangle);
        assertEquals(0, shop.getTotalDiscountProfit(), 1);

    }

    @Test
    public void canGetTotalDiscountProfit__glockenspiel(){
        shop.addStock(glockenspiel);
        assertEquals(59.8, shop.getTotalDiscountProfit(), 1);

    }

    @Test
    public void canGetTotalDiscountProfit__multipleItems(){
        shop.addStock(glockenspiel);
        shop.addStock(triangle);
        assertEquals(59.8, shop.getTotalDiscountProfit(), 1);
    }

}
