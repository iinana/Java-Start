package ch02.sec07;

public class PromotionExample {
    public static void main (String[] args) {
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue : " + intValue);

        char charValue = 'A';
        intValue = charValue;
        System.out.println("Unicode of 'A' : " + intValue);

        intValue = 50;
        long longValue = intValue;
        System.out.println("longValue : " + longValue);

        longValue = 100;
        float floatValue = longValue;
        System.out.println("flaotValue : " + floatValue);

        floatValue = 100.5F;
        double doubleValue = floatValue;
        System.out.println("doubleValue : " + doubleValue);

        /* error : char type only allow positive, so byte type cannot be char type */
        // byteValue = 65;
        // charValue = byteValue;
    }
}
