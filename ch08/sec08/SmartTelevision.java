package ch08.sec08;

public class SmartTelevision implements RemoteControl, Searchable {
    /* "RemoteControl" abstract method overriding */
    @Override
    public void turnOn() {
        System.out.println("Turn on Smart TV");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off Smart TV");
    }


    /* "Searchable" abstract method overriding */
    @Override
    public void search(String url) {
        System.out.println("Searching " + url);
    }
}
