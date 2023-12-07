package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class ProductTest
{
    @Test
    public void shouldCountQuantity()
    {
        Product p1 = new FoodProduct(6745, 5.50, "Penne Pasta",200, LocalDate.parse("2024-06-04"));
        Product p2 = new FoodProduct(8853, 6.50, "Spaghetti Pasta",150, LocalDate.parse("2024-09-12"));
        Product p3 = new FoodProduct(2106, 4.50, "Linguine Pasta", 130,LocalDate.parse("2024-08-18"));
        assertEquals(p3.getTotalQuantity(), 3);
    }
}
