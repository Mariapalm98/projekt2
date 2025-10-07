package se.iths.maria.projekt2;

public class Phone extends Product {
    public Phone(String articleNumber, String title, double price, String description) {
        super(articleNumber, title, price, description);
    }

    @Override
    public String category() {
        return "Telefon";
    }

}
