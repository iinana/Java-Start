package ch08.sec06;

public interface RemoteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    /* abstract method */
    void turnOn();
    void turnOff();
    void setVolume(int volume);

    /* default method */
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("Mute");
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("Unmute");
        }
    }

    static void changeBattery() {
        System.out.println("Change Remote Control Battery");
    }
}