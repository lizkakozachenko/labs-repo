package org.example;

enum Priority {
    LOW, MEDIUM, HIGH
}

public class Task {
    private String description;
    private Priority priority;

    public Task(String description, Priority priority) {
        this.description = description;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public Priority getPriority() {
        return priority;
    }

    public static void main(String[] args) {

        Task[] tasks = {
                new Task("Написать отчёт", Priority.HIGH),
                new Task("Позвонить клиенту", Priority.MEDIUM),
                new Task("Проверить почту", Priority.LOW),
                new Task("Поиграть", Priority.HIGH),
                new Task("Поспать", Priority.MEDIUM)
        };

        System.out.println("Задачи с приоритетом HIGH:");
        for (Task t : tasks) {
            if (t.getPriority() == Priority.HIGH) {
                System.out.println(t.description);
            }
        }
    }
}
