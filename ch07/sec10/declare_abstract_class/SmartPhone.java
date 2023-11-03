package ch07.sec10.declare_abstract_class;

public class SmartPhone extends Phone {
    SmartPhone(String owner) {
        super(owner);
    }

    void internetSearch() {
        System.out.println("Searching on the Internet");
    }
}
