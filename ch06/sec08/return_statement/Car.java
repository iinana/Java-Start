package ch06.sec08.return_statement;

public class Car {
    int gas;

    void setGas(int gas) {
        this.gas = gas;
    }

    boolean ifLeftGas() {
        if (gas == 0) {
            System.out.println("No Left Gas");
            return false;
        }
        System.out.println("Gas Left");
        return true;
    }

    void run()  {
        while (true) {
            if (gas > 0) {
                System.out.printf("Run (Left Gas : %d)\n", gas);
                gas--;
            } else {
                System.out.printf("Run (Left Gas : %d)\n", gas);
                return;
            }
        }
    }
}
