package ru.gb.ergakov.HW_4.task_2.infrastructure;

import lombok.NoArgsConstructor;
import ru.gb.ergakov.HW_4.task_2.models.Buyer;

import java.util.ArrayList;

@NoArgsConstructor
public class FindBuyer {
    public Buyer findBuyer(ArrayList<Buyer> array, String inputBuyer ){
        for (Buyer buyer : array) {
            if (buyer.getName().equals(inputBuyer)) {
                return buyer;
            }
        }
        return null;
    }
}
