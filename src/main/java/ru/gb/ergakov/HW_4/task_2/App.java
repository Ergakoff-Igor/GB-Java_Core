package ru.gb.ergakov.HW_4.task_2;

import lombok.NoArgsConstructor;
import ru.gb.ergakov.HW_4.task_2.infrastructure.AddOrder;
import ru.gb.ergakov.HW_4.task_2.infrastructure.Purchase;
import ru.gb.ergakov.HW_4.task_2.models.Buyer;
import ru.gb.ergakov.HW_4.task_2.models.Order;
import ru.gb.ergakov.HW_4.task_2.models.Product;

import java.util.ArrayList;

@NoArgsConstructor
public class App {
    public static ArrayList<Product> products = new ArrayList<>();
    public static ArrayList<Buyer> buyers = new ArrayList<>();
    public static ArrayList<Order> orders = new ArrayList<>();

    public void buttonClick() {
        products.add(new Product("iphone", 3));
        products.add(new Product("samsung", 2));
        products.add(new Product("xiaomi", 3));

        buyers.add(new Buyer("Ivan"));
        buyers.add(new Buyer("Semen"));
        buyers.add(new Buyer("Elvira"));

        String buyer1 = "Ivan";
        String buyer2 = "Elvira";
        String buyer3 = "Semen";
        String buyer4 = "Anton";

        String product1 = "iphone";
        String product2 = "Honor";


        AddOrder.addOrder(orders, new Purchase().purchase(products, buyers, product1, buyer1, 1));
        AddOrder.addOrder(orders, new Purchase().purchase(products, buyers, product1, buyer3, 1));
        AddOrder.addOrder(orders, new Purchase().purchase(products, buyers, product2, buyer2, 1));
        System.out.printf("Количество заказов: %d", orders.size());


    }
}
