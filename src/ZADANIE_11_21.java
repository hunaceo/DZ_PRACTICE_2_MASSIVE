public class ZADANIE_11_21 {
    public static void main(String[] args) {

        int[] January = new int[31];

        System.out.print("Колличество осадков за каждый день января: ");
        for (int i = 0; i < January.length; i++) {
            January[i] = (int) ((Math.random() * (20 + 1) + 0));
            System.out.print(January[i] + " ");
        }

        System.out.println();

        int sum = 0;
        for (int x : January) {
            sum = sum + x;
        }
        System.out.println(String.format("Общее колличество осадков: %d", sum));
    }
}

