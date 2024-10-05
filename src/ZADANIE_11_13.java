import java.util.Scanner;

public class ZADANIE_11_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index;

        int[] massive = {10, 20, 30, 40, 50};

        System.out.println("Диапазон массива от 1 до 5");

        do {
            System.out.print("Введите индекс элемента массива:");
            index = scanner.nextInt();

            if (index < 1 || index > 5) {

                System.out.println("Ошибка. Введите число от 1 до 5");

            }
        } while (index < 1 || index > 5);

        System.out.println(String.format("Значение массива с индексом %d равно %d", index, massive[index - 1]));
    }
}

