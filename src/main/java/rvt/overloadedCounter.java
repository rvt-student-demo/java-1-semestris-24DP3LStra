package rvt;

public class overloadedCounter {

    // Privātais lauks, kas glabā skaitītāja vērtību
    private int value;

    // Konstruktors ar sākuma vērtību
    public overloadedCounter(int startValue) {
        this.value = startValue;
    }

    // Konstruktors bez parametriem (sākuma vērtība = 0)
    public overloadedCounter() {
        this.value = 0;
    }

    // Metode, kas atgriež pašreizējo vērtību
    public int value() {
        return value;
    }

    // Metode, kas palielina vērtību par 1
    public void increase() {
        value = value + 1;
    }

    // Metode, kas samazina vērtību par 1
    public void decrease() {
        value = value - 1;
    }
}
