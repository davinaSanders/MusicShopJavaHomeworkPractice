package Stock.Accessories;

import Stock.ISell;

public abstract class Accessory implements ISell {
    protected double wPrice;
    protected double rPrice;
    protected AccessoryType type;

    public Accessory(double wPrice, double rPrice, AccessoryType type){
        this.wPrice = wPrice;
        this.rPrice = rPrice;
        this.type = type;

        }

        public double getWprice(){
            return this.wPrice;

        }

        public double getRprice(){
            return this.rPrice;
        }

        public double calculateMarkup() {
            return this.getRprice() - this.getWprice();

        }

        public double getFourtyDiscountPrice() {
            return this.rPrice * 0.6;
    }

        public void setDiscountPrice() {
            this.rPrice = getFourtyDiscountPrice();

        }



}
