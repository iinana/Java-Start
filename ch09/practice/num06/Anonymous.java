package ch09.practice.num06;

public class Anonymous {
    Vehicle field = new Vehicle() {
        @Override
        public void run() {
            System.out.println("Bicycle Running");
        }
    };

    void method1() {
        Vehicle localVar = new Vehicle() {
            @Override
            public void run() {
                System.out.println("Car Running");
            }
        };
        localVar.run();
    }

    void method2(Vehicle v) {
        v.run();
    }
}
