package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Task[] tasks = new Task[5]; // Array to hold 5 tasks

        tasks[0] = new Task("Learn Java");
        System.out.println(tasks[0]); // [ ] Learn Java
        tasks[0].markCompleted();
        System.out.println(tasks[0]); // [✓] Learn Java

        tasks[1] = new Task("Create a repository");
        System.out.println(tasks[1]); // [ ] create repository
        tasks[1].markCompleted();
        System.out.println(tasks[1]); // [✓] Learn Java

        tasks[2] = new Task("create a name for it");
        tasks[3] = new Task("Upload previous projects");
        tasks[4] = new Task("Share link to my GitHub repository");
    }
}
