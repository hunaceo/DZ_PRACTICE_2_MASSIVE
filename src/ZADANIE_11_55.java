public class ZADANIE_11_55 {
    public static void main(String[] args) {
        int[] massive = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.print("Задан массив: ");
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + " ");
        }

        int sum = 0;

        for (int x:massive) {
            if (x % 2 != 0){
                sum += x;
            }
        }

        System.out.println();

        System.out.println(String.format("Сумма нечетных эллементов: %d", sum));
    }
}
