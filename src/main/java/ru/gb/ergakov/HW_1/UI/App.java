package ru.gb.ergakov.HW_1.UI;

import ru.gb.ergakov.HW_1.Actions.AddNote;
import ru.gb.ergakov.HW_1.Actions.LoadFromCSV;
import ru.gb.ergakov.HW_1.Actions.PrintNoteBook;
import ru.gb.ergakov.HW_1.Config;
import ru.gb.ergakov.HW_1.Infrastructure.NoteBook;

import java.util.Scanner;

public class App {
    private static final String path = Config.pathDb;
    public void ButtonClick() {
        System.out.print("\033[H\033[J");
        NoteBook noteBook = new LoadFromCSV().load(path);
        PrintNoteBook pnb = new PrintNoteBook();
        AddNote add = new AddNote();

        try (Scanner in = new Scanner(System.in)) {

            while (true) {
                System.out.println("\nДействия:");
                System.out.println("1 - просмотреть записи");
                System.out.println("2 - добавить запись");
                System.out.println("0 - выход");
                System.out.print("Выберите действие: ");
                String key = in.next();
                System.out.print("\033[H\033[J");
                switch (key) {
                    case "1" -> {
                        System.out.print("\033[H\033[J");
                        pnb.printAll(noteBook);
                    }
                    case "2" -> {
                        System.out.print("\033[H\033[J");
                        add.addNote(path, noteBook);
                    }
                    case "0" -> System.exit(0);
                    default -> System.out.println("Такой команды нет");
                }
            }
        }
    }
}
