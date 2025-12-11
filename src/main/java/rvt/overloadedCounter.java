package rvt;

public class overloadedCounter {

    private int value;

    // Konstruktors ar sākuma vērtību
    public overloadedCounter(int startValue) {
        this.value = startValue;
    }

    // Konstruktors bez parametriem
    public overloadedCounter() {
        this.value = 0;
    }

    //atgriež pašreizējo vērtību
    public int value() {
        return value;
    }

    // palielina vērtību par 1
    public void increase() {
        value = value + 1;
    }

    //samazina vērtību par 1
    public void decrease() {
        value = value - 1;
    }

    //palielina vērtību
    public void increase(int increaseBy) {
        if (increaseBy >= 0) {
            value = value + increaseBy;
        }
    }

    //samazina vērtību
    public void decrease(int decreaseBy) {
        if (decreaseBy >= 0) {
            value = value - decreaseBy;
        }
    }
}
