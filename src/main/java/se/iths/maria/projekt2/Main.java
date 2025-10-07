package se.iths.maria.projekt2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    private static List<Product> products = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            System.out.println("Tryck 1 för att lägga till produkt");
            System.out.println("Tryck 2 för att lista alla produkter");
            System.out.println("Tryck 3 för att visa info om en produkt");
            System.out.println("Tryck 4 för att avsluta applikation");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    addProduct();
                    break;
                case "2":
                    allProducts();
                    break;
                case "3":
                    infoProducts();
                    break;
                case "4":
                    System.out.println("Nu avslutas applikation");
                    System.exit(0);
            }
        }

    }

    private static void addProduct() {
        System.out.println("Vad för typ av produkt vill du lägga till");
        System.out.println("1, Bok");
        System.out.println("2, Telefon");
        System.out.println("3, Kläder");
        String choise = scanner.nextLine();

        System.out.println("Skriv in artikel nummer");
        String articleNumber = scanner.nextLine();
        System.out.println("Skriv in titel/Namn");
        String title = scanner.nextLine();
        System.out.println("Skriv in pris");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Skriv en kort beskrivning");
        String description = scanner.nextLine();


        switch (choise) {
            case "1":
                products.add(new Book(articleNumber, title, price, description));
                break;
            case "2":
                products.add(new Phone(articleNumber, title, price, description));
                break;
            case "3":
                products.add(new Clothes(articleNumber, title, price, description));
                break;
        }

    }

    private static void allProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
        if (products.size() == 0) {
            System.out.println("Det finns inga produkter registerade");
        }
    }

    private static void infoProducts() {
        System.out.println("Vänligen fyll i artikelnummer");
        String articleNumber = scanner.nextLine();
        boolean articleNumberExists = true;
        if (articleNumberExists) {
            System.out.println(products);
        }
    }
}


