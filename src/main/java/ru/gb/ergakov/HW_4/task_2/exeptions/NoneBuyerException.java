package ru.gb.ergakov.HW_4.task_2.exeptions;

public class NoneBuyerException extends RuntimeException{
    public NoneBuyerException(String buyerName){
        super(String.format("Пользователь: %s не зарегистрирован в системе", buyerName));
    }
}
