package com.example.myapplication.model;

public class Task {
    private boolean mStatus;
    private String mName;

    public Task(String name) {
        mStatus = false;
        mName = name;
    }

    public String getName() {
        return mName;
    }

    public boolean isDone() {
        return mStatus;
    }

    public void setName(String name) {
        mName = name;
    }

    public void setStatus(boolean done) {
        mStatus = done;
    }
}

