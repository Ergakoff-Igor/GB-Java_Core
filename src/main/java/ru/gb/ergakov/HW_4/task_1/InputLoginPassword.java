package ru.gb.ergakov.HW_4.task_1;

import lombok.NoArgsConstructor;
import ru.gb.ergakov.HW_4.task_1.exeptions.WrongLoginException;
import ru.gb.ergakov.HW_4.task_1.exeptions.WrongPasswordException;

import java.util.Scanner;

@NoArgsConstructor
public class InputLoginPassword {
    public static boolean input() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Введите логин: ");
            String login = in.next();
            if (login.length() > 20){
                throw new WrongLoginException(login);
            }
            System.out.print("Введите пароль: ");
            String password = in.next();
            System.out.print("Повторите пароль для подтверждения : ");
            String confirmPassword = in.next();
            if (password.length() > 20 || !password.equals(confirmPassword)){
                throw new WrongPasswordException(password);
            }
            System.out.printf("Логин: %-20.20s, Пароль: %-20.20s, Повторный пароль: %-20.20s", login, password, confirmPassword);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}