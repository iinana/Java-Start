package ch08.sec04;

public class Audio implements RemoteControl {
    int volume;

    @Override
    public void turnOn() {
        System.out.println("Turn on Audio");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off Audio");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) this.volume = RemoteControl.MAX_VOLUME;
        else if (volume < RemoteControl.MIN_VOLUME) this.volume = RemoteControl.MIN_VOLUME;
        else this.volume = volume;
        System.out.println("Current Audio Volume: " + this.volume);
    }
}
