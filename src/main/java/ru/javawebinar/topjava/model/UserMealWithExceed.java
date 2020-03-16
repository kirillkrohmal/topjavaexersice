package ru.javawebinar.topjava.model;

import java.time.LocalDateTime;

/**
 * GKislin
 * 11.01.2015.
 */
public class UserMealWithExceed {
    private final boolean exceed;

    private final LocalDateTime dateTime;

    private final String description;

    private final int calories;

    public UserMealWithExceed(LocalDateTime dateTime, String description, int calories, boolean exceed) {
        this.dateTime = dateTime;
        this.description = description;
        this.calories = calories;
        this.exceed = exceed;
    }

    @Override
    public String toString() {
        return
                "dateTime=" + dateTime +
                ", description='" + description + '\'' +
                ", calories=" + calories;
    }
}
