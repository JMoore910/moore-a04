package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Jeanne Moore
 */

public record Product(String name, double price, int quantity) {

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice(){
        return price;
    }

    //print method within Product Class
    public void printProduct() {
        System.out.println("Name :" + name);
        System.out.printf("Price: %.2f%n", price);
        System.out.println("Quantity: " + quantity);
    }
}
