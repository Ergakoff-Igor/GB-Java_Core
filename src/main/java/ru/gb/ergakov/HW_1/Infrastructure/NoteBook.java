package ru.gb.ergakov.HW_1.Infrastructure;

import ru.gb.ergakov.HW_1.Models.Note;

import java.util.ArrayList;
import java.util.List;

public class NoteBook {
    private List<Note> notes;
    public NoteBook() {
        notes = new ArrayList<Note>();
    }

    // Добавление задачи
    public boolean add(Note note) {
        boolean flag = false;
        if (!notes.contains(note)) {
            notes.add(note);
            flag = true;
        }
        return flag;
    }

    // Вывод задачи по индексу
    public Note getNote(int index) {
        return contains(index) ? notes.get(index) : null;
    }

    // Проверка записной книжки
    private boolean contains(int index) {
        return notes != null
                && notes.size() > index;
    }

    // Размер записной книжки
    public int count() {
        return notes.size();
    }
}
