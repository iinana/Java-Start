package ch08.sec10.promotion;

public class PromotionExample {
    public static void main(String[] args) {
        /* Objects
         * B (implements A) -> D
         * C (implements A) -> C */
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        /* Interface Variable */
        A a;

        a = b;  // A <- B Promotion (Automatic Type Changing)
        a = c;  // A <- C Promotion
        a = d;  // A <- D Promotion (D extends B)
        a = e;  // A <- E Promotion (E extends C)
    }
}
