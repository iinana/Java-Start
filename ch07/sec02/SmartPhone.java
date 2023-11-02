package ch07.sec02;

public class SmartPhone extends Phone {
    public boolean wifi;
    public SmartPhone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("Change Wifi Status");
    }

    public void internet() {
        System.out.println("Connect to Internet");
    }
}
