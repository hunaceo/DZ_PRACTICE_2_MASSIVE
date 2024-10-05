import java.util.Scanner;

public class ZADANIE_11_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите колличество эллементов массива: ");
        int quantityofelements = scanner.nextInt();

        int[] massive = new int[quantityofelements];

        for (int i = 0; i < massive.length; i++) {
            System.out.println("Введите элемент массива: ");
            massive[i] = scanner.nextInt();
        }

        System.out.println("Ваш массив: ");

        for (int i = 0; i < massive.length; i++) {
            System.out.println(massive[i] + "");
        }

        System.out.println();
        System.out.println("Массив в обратно порядке: ");

        for (int i = massive.length; i > 0; i--) {
            System.out.println(massive[i - 1] + " ");
        }


    }
}




