package se.iths.maria.projekt2;

public class Book extends Product {
    public Book(String articleNumber, String title, double price, String description) {
        super(articleNumber, title, price, description);

    }

    @Override
    public String category() {
        return "Bok";
    }

}
