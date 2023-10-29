package ru.gb.ergakov.HW_4.task_2.models;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Order {
    private String product;
    private String buyer;
    private int quantity;

    @Override
    public String toString() {
        return String.format("Наименование: %-10.10s Покупатель: %-10.10s Количество: %-10.10s", product, buyer, quantity);
    }
}
