package Visitor.Items.Book;

import Visitor.Items.Book.BookItem;
import Visitor.ShopVisitor;

/**
 * Programming books class
 */
public class ProgrammingBookItem extends BookItem {
    String programmingLanguage; // main book description

    public ProgrammingBookItem(String barCode, String name, String programmingLanguage, double price, int numberOfPages) {
        this.barCode = barCode;
        this.name = name;
        this.programmingLanguage = programmingLanguage;
        this.price = price;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void accept(ShopVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return super.toString() + "..." + programmingLanguage;
    }
}
