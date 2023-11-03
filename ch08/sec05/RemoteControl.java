package ch08.sec05;

public interface RemoteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setVolume(int volume);

    // default instant method
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("Mute");
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("UnMute");
        }
    }
}
