public class ZADANIE_arrays_2mern_3 {
    public static void main(String[] args) {
        int[][] massive = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i + j == 4) {
                    massive[i][j] += 1;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(massive[i][j]);
            }
            System.out.println();
        }
    }
}
