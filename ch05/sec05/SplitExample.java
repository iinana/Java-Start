package ch05.sec05;

public class SplitExample {
    public static void main (String[] args) {
        String board = "1,Java,Reference Type String,Hong";
        String[] tokens = board.split(",");

        System.out.println("Num : " + tokens[0]);
        System.out.println("Language : " + tokens[1]);
        System.out.println("Chapter : " + tokens[2]);
        System.out.println("Name : " + tokens[3]);
        System.out.println();

        for (int i = 0 ; i < tokens.length; i++) System.out.println(tokens[i]);
    }
}
