package ch07.sec11;

public final class Employee extends Person {    // nothing can extend Employee
    @Override
    public void work() {
        System.out.println("Produce Products");
    }
}
