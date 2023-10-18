package ch03.sec08;

public class BitShiftExample2 {
    public static void main (String[] args) {
        int value = 772;  // [00000000] [00000000] [000000011] [00000100]
      
        // move 24bit(3 byte) and read end one byte
        byte byte1 = (byte) (value >>> 24);     // [00000000]
        System.out.println("first byte without sign : " + byte1); 

        byte byte2 = (byte) (value >>> 16);     // [00000000]
        System.out.println("second byte without sign : " + byte2);

        byte byte3 = (byte) (value >>> 8);      // [000000011]
        System.out.println("third byte without sign : " + byte3);

        byte byte4 = (byte) value;              // [00000100]
        System.out.println("fourth byte without sign : " + byte4);
    }
}
