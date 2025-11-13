package rvt;

import java.util.*;

public class Statistics {
    private int count;
    private int sum;


    //always reference data type
    public Statistics() {
        // initialize the variable numberCount here
        this.sum = 0;
        this.count = 0;

    }

    public void addNumber(int number) {
        this.sum += number;
        this.count++;
        // write code here
    }

    public int getCount() {
        // write code here
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        // write code here
        return this.sum / (double)this.count;
    }
    
}
