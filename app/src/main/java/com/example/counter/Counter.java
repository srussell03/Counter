package com.example.counter;

public class Counter {
    Integer value;

    public Counter(Integer value) {
        this.value = value;
    }

    public Counter() {
        this.value = 0;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
    public void incrementValue(){
        value++;
    }
    public void reset(){
        value = 0;
    }
}
