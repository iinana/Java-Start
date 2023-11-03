package ch07.sec10.redeclare_abstract_class;

public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Woof Woof");
    }
}
