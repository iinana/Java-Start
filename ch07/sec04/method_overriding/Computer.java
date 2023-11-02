package ch07.sec04.method_overriding;

public class Computer extends Calculator{
    @Override  //can drop
    public double areaCircle(double r) {
        System.out.println("Computer Object - areaCircle() Run");
        return Math.PI * r * r;
    }
}
