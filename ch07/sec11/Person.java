package ch07.sec11;

public sealed class Person permits Employee, Manager {  // only Employee & Manager can extend Person
    public String name;

    public void work() {
        System.out.println("Nothing to work");
    }
}
