package ch07.sec02;

public class SmartPhoneExample {
    public static void main (String[] args) {
        SmartPhone myPhone = new SmartPhone("Galaxy", "Silver");

        System.out.println("Model: " + myPhone.model);
        System.out.println("Color: " + myPhone.color);
        System.out.println("Wifi Status: " + myPhone.wifi);
        System.out.println();

        myPhone.bell();
        myPhone.sendVoice("Hello");
        myPhone.receiveVoice("Hello! I'm Hong.");
        myPhone.sendVoice("Nice to meet you");
        myPhone.hangUp();
        System.out.println();

        myPhone.setWifi(true);
        myPhone.internet();
    }
}
