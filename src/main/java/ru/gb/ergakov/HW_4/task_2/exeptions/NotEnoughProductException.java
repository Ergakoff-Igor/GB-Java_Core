package ru.gb.ergakov.HW_4.task_2.exeptions;

public class NotEnoughProductException extends RuntimeException{
    public NotEnoughProductException(int quantity, String productName){
        super(String.format("На складе осталось %d %s", quantity, productName));
    }
}
