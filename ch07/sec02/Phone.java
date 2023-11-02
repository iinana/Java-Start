package ch07.sec02;

public class Phone {
    /* field declaration */
    public String model;
    public String color;

    /* method declaration */
    public void bell() {
        System.out.println("Bell Ringing");
    }

    public void sendVoice(String message) {
        System.out.println("Me: " + message);
    }

    public void receiveVoice(String message) {
        System.out.println("You: " + message);
    }

    public void hangUp() {
        System.out.println("Hang up");
    }
}
