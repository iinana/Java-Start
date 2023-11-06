package ch09.sec07.anonymous_interface_obj;

public class HomeExample {
    public static void main(String[] args) {
        Home home = new Home();
        home.use1();
        home.use2();

        home.use3(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("Turn on Audio");
            }

            @Override
            public void turnOff() {
                System.out.println("Turn off Audio");
            }
        });
    }
}
