package ch03.sec07;

public class LogicalOperatorExample {
    public static void main (String[] args) {
        // int charCode = 'A';
        // int charCode = 'a';
        int charCode = '5';
        if ((charCode >= 65) && (charCode <= 90)) System.out.println("Upper Scale Alphabet");
        else if ((charCode >= 97) && (charCode <= 122)) System.out.println("Lower Scale Alphabet");
        else if ((charCode >= 48) && (charCode <= 57)) System.out.println("Integer Between 0-9");

        // int value = 6;
        int value = 7;
        if ((value % 2 == 0) && (value % 3 == 0)) System.out.println("multiple of 2 and 3");
        boolean res = (value % 2 == 0) || (value % 3 == 0);
        if (!res) System.out.println("Neither multiple 2 or 3");
    }
}
