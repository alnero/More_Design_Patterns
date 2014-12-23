package Visitor.Items.DVD;

import Visitor.ShopVisitor;

/**
 * Class for DVDs with software
 */
public class SoftDVDItem extends DVDItem{

    public SoftDVDItem(String barCode, String name, boolean doubleLayer, double price) {
        this.barCode = barCode;
        this.name = name;
        this.doubleLayer = doubleLayer;
        this.price = price;
    }
    @Override
    public void accept(ShopVisitor visitor) {
        visitor.visit(this);
    }
}
