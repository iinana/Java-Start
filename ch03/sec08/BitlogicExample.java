package ch03.sec08;

public class BitlogicExample {
    public static void main (String[] args) {
        byte n1 = 45;
        byte n2 = 25;

        int AND = n1 & n2;
        System.out.printf("%d & %d = %d\n", n1, n2, AND);

        int OR = n1 | n2;
        System.out.printf("%d | %d = %d\n", n1, n2, OR);

        int XOR = n1 ^ n2;
        System.out.printf("%d ^ %d = %d\n", n1, n2, XOR);

        int NOT = ~n1;
        System.out.printf("~%d = %d\n", n1, NOT);

        System.out.println("--------------------------------------------------");

        /* Problem : got unsigned int(0~255) 136 from C. but byte(-128~127) it made 136 as -120 */
        int receivedOrigin = 136;
        byte receiveData = (byte)receivedOrigin;
        System.out.println("Original Data : " + receivedOrigin);
        System.out.println("Ruined Version : " + receiveData);

        // Solution 1 : Using Bit Logical AND Operator
        int unsignedInt1 = receiveData & 255;
        System.out.println(unsignedInt1);

        // Solution 2 : Use Java API
        int unsginedInt2 = Byte.toUnsignedInt(receiveData);
        System.out.println(unsginedInt2);
    }
}
