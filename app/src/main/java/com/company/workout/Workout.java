package com.company.workout;

public class Workout {

    private String name;
    private String description;

    public static final Workout[] workouts = {
            new Workout("workout1", "description1"),
            new Workout("workout2", "description2"),
            new Workout("workout3", "description3"),
            new Workout("workout4", "description4")
    };

    public Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static Workout[] getWorkouts() {
        return workouts;
    }

    public String getName() {

        return name;

    }

    public void setName(String name) {
        this.name = name;
    }
}
