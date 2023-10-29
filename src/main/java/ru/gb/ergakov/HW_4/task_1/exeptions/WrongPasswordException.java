package ru.gb.ergakov.HW_4.task_1.exeptions;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class WrongPasswordException extends Exception{
    public WrongPasswordException(String input){
        super(String.format("В пароле %s больше 20 символов, либо пароли не совпадают", input));
    }
}
