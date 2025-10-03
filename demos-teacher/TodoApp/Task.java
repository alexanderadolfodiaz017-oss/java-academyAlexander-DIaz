package com.pluralsight;

import java.time.LocalDate;

public class Task {
    // List of classmates in the test ///

    //Instance variable
    // a variable linked to a class/
    private String title;
    private LocalDate duedate;
    private boolean complete;
    private String urgency; // (A list of default values => ENUM)
    private String NotificationMessage;
    private boolean Reminder;

    //Step 2 Add a constructor
    //Add a constructor that accepts a title when you create a new task.
    //Hint: Public Classname(Datatype _parameter)
    //this.variablename = _parameter)
    public Task(String title) {
        this.title = title;
        this.complete = false; // default value
    }

    //Step 3: Add a method to mark the task complete
    public void markCompleted() {
        this.complete = true;
        System.out.println("Task \"" + title + "\" is now completed!");
    }

    // Step 4 — Add a toString() method
    // This controls how the task is printed:
    @Override
    public String toString() {
        if (complete) {
            return "[✓] " + title;
        } else {
            return "[ ] " + title;
        }
    }

    // String title
    // LocalDate due date
    // A reminder
    //Boolean complete or incomplete
    //Urgency
    //Reminder Yes or No(boolean)
    //String NotificationMessage

    // Optional: Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDuedate() {
        return duedate;
    }

    public void setDuedate(LocalDate duedate) {
        this.duedate = duedate;
    }

    public boolean isComplete() {
        return complete;
    }

    public String getUrgency() {
        return urgency;
    }

    public void setUrgency(String urgency) {
        this.urgency = urgency;
    }

    public String getNotificationMessage() {
        return NotificationMessage;
    }

    public void setNotificationMessage(String notificationMessage) {
        this.NotificationMessage = notificationMessage;
    }

    public boolean hasReminder() {
        return Reminder;
    }

    public void setReminder(boolean reminder) {
        this.Reminder = reminder;
    }
}
