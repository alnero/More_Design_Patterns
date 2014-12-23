package Visitor.Items.DVD;

import Visitor.ShopVisitor;

/**
 * Music DVD class
 */
public class MusicDVDItem extends DVDItem{
    public MusicDVDItem(String barCode, String name, boolean doubleLayer, double price) {
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
