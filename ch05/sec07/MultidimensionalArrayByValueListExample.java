package ch05.sec07;

public class MultidimensionalArrayByValueListExample {
    public static void main (String[] args) {
        // two dimensional array
        int[][] scores = {
            { 80, 90, 96 },
            { 76, 88 }
        };

        // Length of array
        System.out.println("Length of first dimension (row) : " + scores.length);
        System.out.println("Length of second dimension - first column : " + scores[0].length);
        System.out.println("Length of second dimension - second column : " + scores[1].length);

        // read array
        System.out.println("scores[0][2] : " + scores[0][2]);
        System.out.println("scores[1][1] : " + scores[1][1]);

        // find average of first column
        int sum0 = 0;
        for (int i = 0; i < scores[0].length; i++) sum0 += scores[0][i];
        System.out.println("Average of Score[0] : " + ((double) sum0 / scores[0].length));

        int sum1 = 0;
        for (int i = 0; i < scores[1].length; i++) sum1 += scores[1][i];
        System.out.println("Average of Score[1] : " + ((double) sum1 / scores[1].length));

        int sum = 0;
        int tot_stu = 0;
        for (int i = 0; i < scores.length; i++) {
            tot_stu += scores[i].length;
            for (int j = 0; j < scores[i].length; j++) sum += scores[i][j];
        }
        System.out.println("Average of Score : " + ((double) sum / tot_stu));
    }
}
