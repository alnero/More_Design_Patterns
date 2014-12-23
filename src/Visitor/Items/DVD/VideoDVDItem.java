package Visitor.Items.DVD;

import Visitor.ShopVisitor;

/**
 * Video DVD Class
 */
public class VideoDVDItem extends DVDItem {
    public VideoDVDItem(String barCode, String name, boolean doubleLayer, double price) {
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
