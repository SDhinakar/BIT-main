package edu.bit.ds.Sorting;

public class Job {
    private String name;
    private Integer priority;

    public Job(String name, Integer priority) {
        this.name = name;
        this.priority = priority;
    }

    // Public getters to access the fields
    public String getName() {
        return name;
    }

    public Integer getPriority() {
        return priority;
    }
}
