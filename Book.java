public class Book {
    // Data members
    String title;
    String author;
    double price;
    String[] genres; // Using varargs for this

    // Constructor using varargs for genres
    public Book(String title, String author, double price, String... genres) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.genres = genres;
    }

    // Method to display book details
    public void displayInfo() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : $" + price);
        System.out.print("Genres: ");
        for (String genre : genres) {
            System.out.print(genre + " ");
        }
        System.out.println();
    }

    // Main method to test the Book class
    public static void main(String[] args) {
        Book b1 = new Book("The one piece", "nakamura", 298.88, "Fiction", "Pirate", "Adventure");
        b1.displayInfo();

        System.out.println();

        Book b2 = new Book("naruto uzumaki", "oda", 399.99, "ninja", "jutsu");
        b2.displayInfo();
    }
}