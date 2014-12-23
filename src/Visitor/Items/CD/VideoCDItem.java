package Visitor.Items.CD;

import Visitor.ShopVisitor;

/**
 * Video CDs class
 */
public class VideoCDItem extends CDItem{

    public VideoCDItem(String barCode, String name, double price) {
        this.barCode = barCode;
        this.name = name;
        this.price = price;
    }

    @Override
    public void accept(ShopVisitor visitor) {
        visitor.visit(this);
    }
}
