import java.util.Scanner;

public class ZADANIE_11_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] massive = {10, 20, 30, 40};

        System.out.println("Задан массив: ");
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + " ");
        }

        System.out.println();

        System.out.println("Массив, в котором каждый элемент увлеичивается в 2 раза: ");
        for (int i = 0; i < massive.length; i++) {
            massive[i] = massive[i] * 2;
            System.out.print(massive[i] + " ");
        }

        System.out.println();

        System.out.print("Введите чсило A: ");
        int a = scanner.nextInt();

        int[] massive1 = {10, 20, 30, 40};

        System.out.println(String.format("Массив, в котром каждый элемент уменьшается на %d: ", a));
        for (int i = 0; i < massive1.length; i++) {
            massive1[i] = massive1[i] - a;
            System.out.print(massive1[i] + " ");
        }

        System.out.println();

        int[] massive2 = {10, 20, 30, 40};
        int b = massive2[0];

        System.out.println(String.format("Массив, в котором каждый элемент разделен на первый элемент, который равен %d: ", massive2[0]));
        for (int i = 0; i < massive2.length; i++) {
            massive2[i] = massive2[i] / b;
            System.out.print(massive2[i] + " ");
        }


    }
}
