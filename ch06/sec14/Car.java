package ch06.sec14;

public class Car {
    private int speed;
    private boolean stop;

    /* Getter & Setter of speed field */
    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
            return;
        } else this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }

    /* Getter & Setter of stop field */
    public boolean isStop() {
        return stop;
    }
    public void setStop(boolean stop) {
        this.stop = stop;
        if (stop == true) this.speed = 0;
    }
}
