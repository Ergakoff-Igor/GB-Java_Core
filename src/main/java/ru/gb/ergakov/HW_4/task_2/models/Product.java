package ru.gb.ergakov.HW_4.task_2.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class Product {
    private String name;
    private int quantity;

    @Override
    public String toString() {
        return this.name;
    }
}
