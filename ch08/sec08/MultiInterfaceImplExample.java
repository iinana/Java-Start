package ch08.sec08;

public class MultiInterfaceImplExample {
    public static void main (String[] args) {
        RemoteControl rc = new SmartTelevision();

        rc.turnOn();
        rc.turnOff();

        Searchable sa = new SmartTelevision();
        sa.search("https://youtube.com");


        SmartTelevision tv = new SmartTelevision();
        tv.turnOn();
        tv.turnOff();
        tv.search("https://hanyang.ac.kr");
    }
}
