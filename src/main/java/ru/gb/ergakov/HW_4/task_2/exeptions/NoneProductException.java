package ru.gb.ergakov.HW_4.task_2.exeptions;

public class NoneProductException extends RuntimeException{
    public NoneProductException(String productName){
        super(String.format("Товаров: %s нет на складе", productName));
    }
}
