package com.example.ukesoppgaveruke49;
import java.util.ArrayList;
import java.util.List;

public class TaskController {
    private static List<Task> tasks = new ArrayList<>();

    public static void addTask(String title, String description) {
        Task task = new Task(title, description);
        tasks.add(task);
    }

    public static List<Task> getTasks() {
        return tasks;
    }
}

