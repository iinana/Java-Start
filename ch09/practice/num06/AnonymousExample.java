package ch09.practice.num06;

public class AnonymousExample {
    public static void main (String[] args) {
        Anonymous anony = new Anonymous();
        anony.field.run();
        anony.method1();

        anony.method2(new Vehicle() {
            @Override
            public void run() {
                System.out.println("Train Running");
            }
        });
    }
}
