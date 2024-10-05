public class ZADANIE_GAYBALL_11_70 {
    public static void main(String[] args) {
        int[] resultgayball = {3, 0, 1, 3, 0, 1, 3, 1, 1, 0, 1, 1, 3, 3, 0, 3, 1, 3, 0, 1};

        System.out.println("Общее колличество игр у геев: 20");


        int sum1 = 0;

        for (int x : resultgayball) {
            if (x == 3) {
                sum1 += 1;
            }
        }
        System.out.println(String.format("Общее колличство выйгранных игр геями: %d", sum1));


        int sum2 = 0;

        for (int y : resultgayball) {
            if (y == 1) {
                sum2 += 1;
            }
        }
        System.out.println(String.format("Общее количество ничьи у геев: %d", sum2));
    }
}
