package ch05.practice;
import java.util.Scanner;

public class ScoreAnalysis {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] scores = {0};
        int num = 0;
        Outer: 
        while (true) {
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("1. Enter Num of Studnet | 2. Enter Score | 3. List of Score | 4. Analysis | 5. Exit");
            System.out.println("-------------------------------------------------------------------------------------");

            System.out.print("Request > ");
            String request = scn.nextLine();
            String strNum;
        
            switch(request) {
                case "1": 
                    System.out.print("Number of Student > ");
                    strNum = scn.nextLine();
                    num = Integer.parseInt(strNum);
                    break;
                case "2":
                    scores = new int[num];
                    for (int i = 0; i < num; i++) {
                        System.out.printf("scores[%d]: ", i);
                        strNum = scn.nextLine();
                        scores[i] = Integer.parseInt(strNum);
                    }
                    break;
                case "3":
                    for (int i = 0; i < scores.length; i++) {
                        System.out.printf("scores[%d]: %d\n", i, scores[i]);
                    }
                    break;
                case "4":
                    int max = 0;
                    int sum = 0;
                    for (int i = 0; i < scores.length; i++) {
                        if (max < scores[i]) max = scores[i];
                        sum += scores[i];
                    }
                    System.out.println("Maximum Score : " + max);
                    System.out.println("Average Score : " + ((double) sum / scores.length));
                    break;
                case "5":
                    System.out.println("Program Exit");
                    break Outer;
                default:
                    System.out.println("Uncorrect Request");
            }
        }       
        scn.close();
    }
}
