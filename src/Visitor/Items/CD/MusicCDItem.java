package Visitor.Items.CD;

import Visitor.ShopVisitor;

/**
 * Music CD class
 */
public class MusicCDItem extends CDItem {

    public MusicCDItem(String barCode, String name, double price) {
        this.barCode = barCode;
        this.name = name;
        this.price = price;
    }

    @Override
    public void accept(ShopVisitor visitor) {
        visitor.visit(this);
    }
}
