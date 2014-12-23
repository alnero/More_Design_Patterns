package Visitor.Items;

import Visitor.ShopVisitor;

/**
 * General interface for all items in the shop
 */
public abstract class ShopItem {
    protected String barCode;
    protected String name;
    protected double price;

    public String getBarCode() {
        return barCode;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract void accept(ShopVisitor visitor);

    @Override
    public String toString() {
        return barCode + "..."  + price + "..." + name;
    }
}
