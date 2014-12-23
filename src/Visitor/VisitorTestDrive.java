package Visitor;

import Visitor.Items.*;
import Visitor.Items.Book.CookingBookItem;
import Visitor.Items.Book.ProgrammingBookItem;
import Visitor.Items.Book.SpiritualBookItem;
import Visitor.Items.CD.MusicCDItem;
import Visitor.Items.CD.SoftCDItem;
import Visitor.Items.CD.VideoCDItem;
import Visitor.Items.DVD.VideoDVDItem;

/**
 * Simulate customer getting info about all items in the shop
 */
public class VisitorTestDrive {
    public static void main(String[] args) {
        ShopItem[] shopItems = {
                new ProgrammingBookItem("||| || ||||", "C# for kids", "C#", 12.59, 230),
                new ProgrammingBookItem("|| || ||||", "Java for kids", "Java", 10.09, 300),
                new ProgrammingBookItem("|| || ||||", "F#, become functional", "F#", 16.00, 400),
                new CookingBookItem("| ||| || |", "Bad cooking receipies", "Beans", 11.99, 100),
                new SpiritualBookItem("| | | |||", "Harry is not potter", (byte) 18, 14.00, 250),
                new MusicCDItem("||| ||", "Ruki Vverh - Kroshka moya", 7.99),
                new VideoCDItem("| || |||", "Ranetki - Best Video", 8.99),
                new SoftCDItem("|| | ||", "Zver Windows 95", 6.99),
                new SoftCDItem("| | ||", "Super Boot CD", 6.99),
                new SoftCDItem("|| || |", "Antivirus Ultimate Edition", 9.99),
                new VideoDVDItem("||| || |", "Kobzon - In tour USA", true, 12.50),
                new VideoDVDItem("| || ||", "XXXL Europa plus", false, 7.50)


        };

        ShopVisitor customer = new ShopVisitorImpl(shopItems);
        customer.printAllItemsDescription();
    }
}
