package se.iths.maria.projekt2;

public class Clothes extends Product {
    public Clothes(String articleNumber, String title, double price, String description) {
        super(articleNumber, title, price, description);
    }
    
    @Override
    public String category() {
        return "Kläder";
    }


}
