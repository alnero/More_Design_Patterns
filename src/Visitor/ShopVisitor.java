package Visitor;

import Visitor.Items.Book.CookingBookItem;
import Visitor.Items.Book.ProgrammingBookItem;
import Visitor.Items.Book.SpiritualBookItem;
import Visitor.Items.CD.MusicCDItem;
import Visitor.Items.CD.SoftCDItem;
import Visitor.Items.CD.VideoCDItem;
import Visitor.Items.DVD.MusicDVDItem;
import Visitor.Items.DVD.SoftDVDItem;
import Visitor.Items.DVD.VideoDVDItem;

/**
 * Visitor interface to traverse all the items in the shop
 */
public interface ShopVisitor {
    // books
    void visit(ProgrammingBookItem item);
    void visit(CookingBookItem item);
    void visit(SpiritualBookItem item);
    // cd
    void visit(MusicCDItem item);
    void visit(VideoCDItem item);
    void visit(SoftCDItem item);
    // dvd
    void visit(MusicDVDItem item);
    void visit(VideoDVDItem item);
    void visit(SoftDVDItem item);

    void printAllItemsDescription();
}
