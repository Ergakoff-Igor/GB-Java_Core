package ru.gb.ergakov.HW_1.Actions;

import ru.gb.ergakov.HW_1.Infrastructure.NoteBook;

public class PrintNoteBook {

    public  void printAll(NoteBook nb){
        for (int i = 0; i < nb.count(); i++) {
            System.out.println(nb.getNote(i));
        }
    }
}
