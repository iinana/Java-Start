package ch07.sec04.call_parent_method;

public class SupersonicAirplane extends Airplane {
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    public int flyMode = NORMAL;

    @Override
    public void fly() {
        if (flyMode == SUPERSONIC) System.out.println("Fly in Supersonic Mode");
        else super.fly();
    }
}
