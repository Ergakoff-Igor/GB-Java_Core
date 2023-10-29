package ru.gb.ergakov.HW_4.task_2.infrastructure;

import lombok.NoArgsConstructor;
import ru.gb.ergakov.HW_4.task_2.models.Product;

import java.util.ArrayList;

@NoArgsConstructor
public class FindProduct {

    public Product findProduct(ArrayList<Product> array, String inputProduct) {
        for (Product product : array) {
            if (product.getName().equals(inputProduct)) {
                return product;
            }
        }
        return null;
    }

}
