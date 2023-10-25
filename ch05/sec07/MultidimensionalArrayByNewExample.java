package ch05.sec07;

public class MultidimensionalArrayByNewExample {
    public static void main (String[] args) {
        // If number of elements in each array is same
        int[][] mathScores = new int[2][3];
        for (int i = 0; i < mathScores.length; i++) {
            for (int j = 0; j < mathScores[i].length; j++) {
                System.out.printf("mathScores[%d][%d] : %d\n", i, j, mathScores[i][j]);
            }
        }
        System.out.println();

        mathScores[0][0] = 80;
        mathScores[0][1] = 83;
        mathScores[0][2] = 85;
        mathScores[1][0] = 86;
        mathScores[1][1] = 90;
        mathScores[1][2] = 92;

        int tot_sum = 0, tot_stu = 0;
        for (int i = 0; i < mathScores.length; i++) {
            tot_stu += mathScores[i].length;
            for (int j = 0; j < mathScores[i].length; j++) tot_sum += mathScores[i][j];
        }
        System.out.println("Average Math Score of Total Students : " + (tot_sum / tot_stu));
        System.out.println();


        // If number of elements in each array is different
        int[][] englishScore = new int[2][];
        englishScore[0] = new int[2];
        englishScore[1] = new int[3];

        for (int i = 0; i < englishScore.length; i++) {
            for (int j = 0; j < englishScore[i].length; j++) {
                System.out.printf("englsihScore[%d][%d] = %d\n", i, j, englishScore[i][j]);
            }
        }
        System.out.println();

        englishScore[0][0] = 90;
        englishScore[0][1] = 91;
        englishScore[1][0] = 92;
        englishScore[1][1] = 93;
        englishScore[1][2] = 94;

        tot_stu = 0;
        tot_sum = 0;
        for (int i = 0; i < englishScore.length; i++) {
            tot_stu += englishScore[i].length;
            for (int j = 0; j < englishScore[i].length; j++) tot_sum += englishScore[i][j];
        }
        System.out.println("Average English Score of Total Students : " + ((double) tot_sum / tot_stu));
    }
}
