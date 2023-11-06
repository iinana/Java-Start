package ch09.sec07.anonymous_class_obj;

public class Car {
    private Tire tire1 = new Tire();

    /* [Way1] Declare Anonymous at Field */
    // Field: anonymous class object declaration
    private Tire tire2 = new Tire() {
        @Override
        public void roll() {
            System.out.println("Anonymous Tire Obj 1 Rolling");
        }
    };
    // Method: using anonymous class object 
    public void run1() {
        tire1.roll();
        tire2.roll();
    }

    /* [Way2] Declare Anonymous in Method */
    public void run2() {
        Tire tire = new Tire() {
            @Override
            public void roll() {
                System.out.println("Anonymous Tire Obj 2 Rolling");
            }
        };
        tire.roll();
    }

    /* [Way3] Using Argument */
    public void run3(Tire tire) {
        tire.roll();
    }
}
