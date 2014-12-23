package Visitor;

import Visitor.Items.*;
import Visitor.Items.Book.BookItem;
import Visitor.Items.Book.CookingBookItem;
import Visitor.Items.Book.ProgrammingBookItem;
import Visitor.Items.Book.SpiritualBookItem;
import Visitor.Items.CD.CDItem;
import Visitor.Items.CD.MusicCDItem;
import Visitor.Items.CD.SoftCDItem;
import Visitor.Items.CD.VideoCDItem;
import Visitor.Items.DVD.DVDItem;
import Visitor.Items.DVD.MusicDVDItem;
import Visitor.Items.DVD.SoftDVDItem;
import Visitor.Items.DVD.VideoDVDItem;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Implementation of the shop visitor interface
 */
public class ShopVisitorImpl implements ShopVisitor{
    HashMap<String, String> items = new HashMap<String, String>();

    HashMap<String, ArrayList<BookItem>> books = new HashMap<String, ArrayList<BookItem>>();
    HashMap<String, ArrayList<CDItem>> CDs = new HashMap<String, ArrayList<CDItem>>();
    HashMap<String, ArrayList<DVDItem>> DVDs = new HashMap<String, ArrayList<DVDItem>>();

    public ShopVisitorImpl(ShopItem[] items) {
        for(ShopItem item : items){
            item.accept(this);
        }
    }

    @Override
    public void visit(ProgrammingBookItem item) {
        if(!items.containsKey("Books")){
            items.put("Books", "Programming");
        }
        if(!books.containsKey("Programming")){
            books.put("Programming", new ArrayList<BookItem>());
        }
        books.get("Programming").add(item);
    }

    @Override
    public void visit(CookingBookItem item) {
        if(!items.containsKey("Books")){
            items.put("Books", "Cooking");
        }
        if(!books.containsKey("Cooking")){
            books.put("Cooking", new ArrayList<BookItem>());
        }
        books.get("Cooking").add(item);
    }

    @Override
    public void visit(SpiritualBookItem item) {
        if(!items.containsKey("Books")){
            items.put("Books", "Spiritual");
        }
        if(!books.containsKey("Spiritual")){
            books.put("Spiritual", new ArrayList<BookItem>());
        }
        books.get("Spiritual").add(item);
    }

    @Override
    public void visit(MusicCDItem item) {
        if(!items.containsKey("CDs")){
            items.put("CDs", "MusicCD");
        }
        if(!CDs.containsKey("MusicCD")){
            CDs.put("MusicCD", new ArrayList<CDItem>());
        }
        CDs.get("MusicCD").add(item);
    }

    @Override
    public void visit(VideoCDItem item) {
        if(!items.containsKey("CDs")){
            items.put("CDs", "VideoCD");
        }
        if(!CDs.containsKey("VideoCD")){
            CDs.put("VideoCD", new ArrayList<CDItem>());
        }
        CDs.get("VideoCD").add(item);
    }

    @Override
    public void visit(SoftCDItem item) {
        if(!items.containsKey("CDs")){
            items.put("CDs", "SoftCD");
        }
        if(!CDs.containsKey("SoftCD")){
            CDs.put("SoftCD", new ArrayList<CDItem>());
        }
        CDs.get("SoftCD").add(item);
    }

    @Override
    public void visit(MusicDVDItem item) {
        if(!items.containsKey("DVDs")){
            items.put("DVDs", "MusicDVD");
        }
        if(!DVDs.containsKey("MusicDVD")){
            DVDs.put("MusicDVD", new ArrayList<DVDItem>());
        }
        DVDs.get("MusicDVD").add(item);
    }

    @Override
    public void visit(VideoDVDItem item) {
        if(!items.containsKey("DVDs")){
            items.put("DVDs", "VideoDVD");
        }
        if(!DVDs.containsKey("VideoDVD")){
            DVDs.put("VideoDVD", new ArrayList<DVDItem>());
        }
        DVDs.get("VideoDVD").add(item);
    }

    @Override
    public void visit(SoftDVDItem item) {
        if(!items.containsKey("DVDs")){
            items.put("DVDs", "SoftDVD");
        }
        if(!DVDs.containsKey("SoftDVD")){
            DVDs.put("SoftDVD", new ArrayList<DVDItem>());
        }
        DVDs.get("SoftDVD").add(item);
    }

    public void printAllItemsDescription(){
        if(items.isEmpty()) {
            System.out.println("No items.");
        } else {
            System.out.println("Items:");
            printBooksInfo();
            printCDsInfo();
            printDVDsInfo();
        }
    }

    private void printBooksInfo(){
        if(books.isEmpty()){
            System.out.println("      No books.");
        } else {
            System.out.println("      Books:");
            for(String theme : books.keySet()){
                System.out.println("            " + theme);
                ArrayList<BookItem> themeBooks = books.get(theme);
                for(BookItem book : themeBooks){
                    System.out.println("               " + book);
                }
            }
        }
    }

    private void printCDsInfo(){
        if(CDs.isEmpty()){
            System.out.println("      No CDs.");
        } else {
            System.out.println("      CDs");
            for(String theme : CDs.keySet()){
                System.out.println("         " + theme);
                ArrayList<CDItem> themeCDs = CDs.get(theme);
                for(CDItem cd : themeCDs){
                    System.out.println("            " + cd);
                }
            }
        }
    }

    private void printDVDsInfo(){
        if(DVDs.isEmpty()){
            System.out.println("      No DVDs.");
        } else {
            System.out.println("      DVDs");
            for(String theme : DVDs.keySet()){
                System.out.println("          " + theme);
                ArrayList<DVDItem> themeDVDs = DVDs.get(theme);
                for(DVDItem dvd : themeDVDs){
                    System.out.println("            " + dvd);
                }
            }
        }
    }
}
