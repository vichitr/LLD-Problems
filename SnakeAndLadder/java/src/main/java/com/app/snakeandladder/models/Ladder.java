package com.app.snakeandladder.models;

public class Ladder {

    private int startBlock;
    private int endBlock;

    public Ladder(int startBlock, int endBlock) {
        this.startBlock = startBlock;
        this.endBlock = endBlock;
    }

    public int getStartBlock() {
        return startBlock;
    }

    public void setStartBlock(int startBlock) {
        this.startBlock = startBlock;
    }

    public int getEndBlock() {
        return endBlock;
    }

    public void setEndBlock(int endBlock) {
        this.endBlock = endBlock;
    }
}
