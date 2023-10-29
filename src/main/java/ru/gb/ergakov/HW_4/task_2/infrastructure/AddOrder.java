package ru.gb.ergakov.HW_4.task_2.infrastructure;

import ru.gb.ergakov.HW_4.task_2.models.Order;

import java.util.ArrayList;

public class AddOrder {
    public static void addOrder(ArrayList<Order> orders,  Order newOrder){
        if (newOrder != null) {
            orders.add(newOrder);
        }
    }
}
