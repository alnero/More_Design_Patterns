package Visitor.Items.CD;

import Visitor.ShopVisitor;

/**
 * CDs with software class
 */
public class SoftCDItem extends CDItem{

    public SoftCDItem(String barCode, String name, double price) {
        this.barCode = barCode;
        this.name = name;
        this.price = price;
    }

    @Override
    public void accept(ShopVisitor visitor) {
        visitor.visit(this);
    }
}
