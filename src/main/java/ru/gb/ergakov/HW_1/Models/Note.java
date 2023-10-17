package ru.gb.ergakov.HW_1.Models;

import java.time.LocalDateTime;
public class Note {
    private LocalDateTime date;
    private String description;

    public Note (LocalDateTime date, String description) {
        this.date = date;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s", getDate(), getDescription());
    }
}
