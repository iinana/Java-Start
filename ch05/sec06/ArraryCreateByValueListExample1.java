package ch05.sec06;

public class ArraryCreateByValueListExample1 {
    public static void main (String[] args) {
        /* 1. String Array */
        String[] season = { "Spring", "Summer", "Fall", "Winter" };
        for (int i = 0; i < season.length; i++) System.out.printf("season[%d] : %s\n", i, season[i]);

        season[1] = "Favorite";
        System.out.println("season[1] : " + season[1]);
        System.out.println();

        /* 2. Integer Array */
        int[] scores = { 83, 90, 87 };
        int sum = 0;
        for (int i = 0; i < scores.length; i++) sum += scores[i];
        System.out.println("Total Sum : " + sum);
        System.out.println("Average : " + ((double) sum / scores.length));
    }
}
