package ch09.sec07.anonymous_interface_obj;

public class Home {
    /* [Way1] Declare Anonymous at Field */
    // Field: anonymous class object declaration
    private RemoteControl rc = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("Turn on TV");
        }

        @Override
        public void turnOff() {
            System.out.println("Turn off TV");
        }
    };
    // Method: using anonymous class object 
    public void use1() {
        rc.turnOn();
        rc.turnOff();
    }

    /* [Way2] Declare Anonymous in Method */
    public void use2() {
        RemoteControl rc = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("Turn on Airconditioner");
            }

            @Override
            public void turnOff() {
                System.out.println("Turn off Airconditioner");
            }
        };

        rc.turnOn();
        rc.turnOff();
    }

    /* [Way3] Using Argument */
    public void use3(RemoteControl rc) {
        rc.turnOn();
        rc.turnOff();
    }
}
