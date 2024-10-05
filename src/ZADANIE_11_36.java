public class ZADANIE_11_36 {
    public static void main(String[] args) {

        int[] massive = {-30, -20, -10, 5, 10, 20, 200};

        System.out.print("Задан массив: ");
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + " ");
        }

        System.out.println();

        System.out.print("Все неотрицательные элементы: ");
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] < 0) {
                System.out.print(massive[i] + " ");
            }
        }

        System.out.println();

        System.out.print("Все элементы не превышающие 100: ");
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] <= 100) {
                System.out.print(massive[i] + " ");
            }
        }
    }
}
