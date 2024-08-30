package model;

import javafx.concurrent.Task;

import java.util.List;

public class User {
    private String name;
    private String password;
    private List<Task> tasks;
    private String task;

    public void setText(String text) {
        this.task=text;
    }

    public String getText() {
        return task;
    }
}
