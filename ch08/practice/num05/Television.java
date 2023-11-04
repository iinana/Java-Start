package ch08.practice.num05;

public class Television implements Remocon {
    @Override
    public void powerOn() {
        System.out.println("TV Power On");
    }

    public static void main (String[] args) {
        Remocon r = new Television();
        r.powerOn();
    }
}
