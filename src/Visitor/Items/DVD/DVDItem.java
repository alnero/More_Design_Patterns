package Visitor.Items.DVD;

import Visitor.Items.ShopItem;

/**
 * Class for all the DVDs in the shop
 */
public abstract class DVDItem extends ShopItem {
    boolean doubleLayer;

    public boolean isDoubleLayer() {
        return doubleLayer;
    }

    @Override
    public String toString() {
        return super.toString() + ( doubleLayer ? "...double layer" : "");
    }
}
