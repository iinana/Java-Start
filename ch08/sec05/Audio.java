package ch08.sec05;

public class Audio implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() { System.out.println("Turn on Audio"); }
    @Override
    public void turnOff() { System.out.println("Turn off Audio"); }
    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) this.volume = RemoteControl.MAX_VOLUME;
        else if (volume < RemoteControl.MIN_VOLUME) this.volume = RemoteControl.MIN_VOLUME;
        else this.volume = volume;
        System.out.println("Current Audio Volume: " + this.volume);
    }

    private int memoryVolume;

    /* Redeclare Default Method */
    @Override
    public void setMute(boolean mute) {
        if (mute) {
            this.memoryVolume = this.volume;
            System.out.println("Mute");
            setVolume(RemoteControl.MIN_VOLUME);
        } else {
            System.out.println("UnMute");
            setVolume(this.memoryVolume);
        }
    }


}
