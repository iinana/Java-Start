package ch08.sec06;

public class Television implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Turn on TV");
    }
    
    @Override
    public void turnOff() {
        System.out.println("Turn off Tv");
    }

    @Override
    public void setVolume(int volume) {
        if (volume < RemoteControl.MIN_VOLUME) this.volume = RemoteControl.MIN_VOLUME;
        else if (volume > RemoteControl.MAX_VOLUME) this.volume = RemoteControl.MAX_VOLUME;
        else this.volume = volume;
        
        System.out.println("Current Volume: " + this.volume);
    }
}
