package com.app.snakeandladder.models;

public class Snake {

    private int headPosition;
    private int tailPosition;

    public Snake(int headPosition, int tailPosition) {
        this.headPosition = headPosition;
        this.tailPosition = tailPosition;
    }

    public int getHeadPosition() {
        return headPosition;
    }

    public void setHeadPosition(int headPosition) {
        this.headPosition = headPosition;
    }

    public int getTailPosition() {
        return tailPosition;
    }

    public void setTailPosition(int tailPosition) {
        this.tailPosition = tailPosition;
    }
}
