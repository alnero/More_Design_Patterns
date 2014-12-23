package Visitor.Items.Book;

import Visitor.Items.Book.BookItem;
import Visitor.ShopVisitor;

/**
 * Cooking books class
 */
public class CookingBookItem extends BookItem {
    String mainIngredient; // main book description

    public CookingBookItem(String barCode, String name, String mainIngredient, double price, int numberOfPages) {
        this.barCode = barCode;
        this.name = name;
        this.mainIngredient = mainIngredient;
        this.price = price;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void accept(ShopVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return super.toString() + "..." + mainIngredient;
    }
}
