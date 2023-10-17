package ru.gb.ergakov.HW_1.UI;

import java.util.Scanner;

public class ConsoleView {
    Scanner in;

    public ConsoleView() {
        in = new Scanner(System.in, "ibm866");
    }


    public String getNote() {
        System.out.print("Запись: ");
        return in.nextLine();
    }
}

