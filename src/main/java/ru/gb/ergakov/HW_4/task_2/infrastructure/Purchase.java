package ru.gb.ergakov.HW_4.task_2.infrastructure;

import lombok.NoArgsConstructor;
import ru.gb.ergakov.HW_4.task_2.exeptions.*;
import ru.gb.ergakov.HW_4.task_2.models.*;

import java.util.ArrayList;

@NoArgsConstructor
public class Purchase {
    public Order purchase(ArrayList<Product> products, ArrayList<Buyer> buyers, String product, String buyer, int quantity) {
        try {
            Product findProduct = new FindProduct().findProduct(products, product);
            Buyer findBuyer = new FindBuyer().findBuyer(buyers, buyer);
            if (findProduct == null) {
                throw new NoneProductException(product);
            } else if (findBuyer == null) {
                throw new NoneBuyerException(buyer);
            } else if (findProduct.getQuantity() < quantity) {
                throw new NotEnoughProductException(findProduct.getQuantity(), findProduct.getName());
            } else {
                Order newOrder = new Order(findProduct.getName(), findBuyer.getName(), quantity);
                findProduct.setQuantity(findProduct.getQuantity() - quantity);
                return newOrder;
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
