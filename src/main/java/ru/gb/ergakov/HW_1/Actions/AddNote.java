package ru.gb.ergakov.HW_1.Actions;

import ru.gb.ergakov.HW_1.Infrastructure.NoteBook;
import ru.gb.ergakov.HW_1.Models.Note;
import ru.gb.ergakov.HW_1.UI.ConsoleView;

import java.time.LocalDateTime;

public class AddNote {
    ConsoleView cv = new ConsoleView();
    SaveToCSV saveCSV = new SaveToCSV();
    public void addNote(String path, NoteBook nb) {
        System.out.println("Добавление записи:\n");
        Note newNote = new Note(LocalDateTime.now(), cv.getNote());
        nb.add(newNote);
        saveCSV.save(path, nb);
    }
}
