package ru.gb.ergakov.HW_4.task_1.exeptions;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class WrongLoginException extends Exception{

    public WrongLoginException (String input){
        super(String.format("В логине %s больше 20 символов", input));
    }
}
