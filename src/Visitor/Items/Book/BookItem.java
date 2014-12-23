package Visitor.Items.Book;

import Visitor.Items.ShopItem;

/**
 * Interface for all te books in the shop
 */
public abstract class BookItem extends ShopItem {
    int numberOfPages;

    int getNumberOfPages(){
        return numberOfPages;
    }

    @Override
    public String toString() {
        return super.toString() + "..." + numberOfPages + "pgs";
    }
}
