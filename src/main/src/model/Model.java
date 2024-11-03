package model;

public class Model {
    public int counter;

    public Model() {
        this.counter = 0;
    }

    public int getCounter() {
        return counter;
    }

    public void incrementCounter() {
        counter++;
    }

    public void resetCounter() {
        counter = 0;
    }
}
