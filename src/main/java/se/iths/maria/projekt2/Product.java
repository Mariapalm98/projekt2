package se.iths.maria.projekt2;

public abstract class Product {
    private String articleNumber;
    private String title;
    private double price;
    private String description;

    public Product(String articleNumber, String title, double price, String description) {
        this.articleNumber = articleNumber;
        this.title = title;
        this.price = price;
        this.description = description;
    }

    public String getArticleNumber() {
        return articleNumber;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }


    public String getDescription() {
        return description;
    }

    public abstract String category();

    @Override
    public String toString() {
        return "Produkt: Artikelnummer = " + articleNumber + ", titel/namn = " + title + ", Pris = " + price;

    }
}
