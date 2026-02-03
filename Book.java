class Book {
    // Attributes
    String title;
    String author;
    double price;
    String isbn;
    int stock;

    // Constructor
    Book(String title, String author, double price, String isbn, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
        this.stock = stock;
    }

    // Display book information
    void displayInfo() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : ₹" + price);
        System.out.println("ISBN   : " + isbn);
        System.out.println("Stock  : " + stock);
        System.out.println("-----------------------------");
    }

    // Reduce price by given percentage
    void applyDiscount(double percentage) {
        price = price - (price * percentage / 100);
    }

    // Increase stock when new copies arrive
    void addStock(int quantity) {
        stock = stock + quantity;
    }

    // Check availability
    boolean isAvailable() {
        return stock > 0;
    }
}

public class BookstoreInventory {
    public static void main(String[] args) {

        // Creating two book objects
        Book novel = new Book(
                "The Alchemist",
                "Paulo Coelho",
                399.0,
                "ISBN001",
                10
        );

        Book textbook = new Book(
                "Data Structures in Java",
                "Seymour Lipschutz",
                699.0,
                "ISBN002",
                0
        );

        // Display initial details
        System.out.println("Initial Book Details:");
        novel.displayInfo();
        textbook.displayInfo();

        // Apply discount
        novel.applyDiscount(10);
        textbook.applyDiscount(15);

        // Add stock
        novel.addStock(5);
        textbook.addStock(8);

        // Display updated details
        System.out.println("After Discount and Stock Update:");
        novel.displayInfo();
        textbook.displayInfo();

        // Check availability
        System.out.println("Availability Status:");
        System.out.println(novel.title + " available: " + novel.isAvailable());
        System.out.println(textbook.title + " available: " + textbook.isAvailable());
    }
}