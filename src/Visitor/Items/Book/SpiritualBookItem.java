package Visitor.Items.Book;

import Visitor.Items.Book.BookItem;
import Visitor.ShopVisitor;

/**
 * Spiritual books class
 */
public class SpiritualBookItem extends BookItem {
    byte allowedAge; // ages allowed to read the book

    public SpiritualBookItem(String barCode, String name, byte age, double price, int numberOfPages) {
        this.barCode = barCode;
        this.name = name;
        this.allowedAge = age;
        this.price = price;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void accept(ShopVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return super.toString() + "...from age of " + allowedAge;
    }
}
