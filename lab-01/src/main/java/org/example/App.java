package org.example;

import java.time.LocalDate;

public class App{

    public static void main(String[]args){
        Product p1 = new FoodProduct(6745, 5.50, "Penne Pasta", LocalDate.parse("2024-10-12"));
        Product p2 = new FoodProduct(8853, 6.50, "Spaghetti Pasta", LocalDate.parse("2024-5-19"));
        Product p3 = new FoodProduct(2186,  4.58, "Linguine Pasta", LocalDate.parse("2024-11-15"));
        System.out.println("Total Quantity: " + p3.getTotalQuantity());

        Product p = new FoodProduct(1234, 9.99, "water", LocalDate.parse("2024-12-12") );
        FoodProduct p4 = new FoodProduct(3452, 10.0, "Cheddar Cheese", 
            LocalDate.parse("2022-06-07"));
        ElectricProduct p5 = new ElectricProduct(4875, 30.0, "Extension cord", "220v");
    }
}
