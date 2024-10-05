public class ZADANIE_11_43 {
    public static void main(String[] args) {
        int[] January = new int[31];

        System.out.print("Колличество осадков за каждый день января: ");
        for (int i = 0; i < January.length; i++) {
            January[i] = (int) ((Math.random() * (20 + 1) + 0));
            System.out.print(January[i] + " ");
        }

        System.out.println();

        System.out.print("В эти дни января осадков не было: ");
        for (int i = 0; i < January.length; i++) {
            if (January[i] == 0) {
                System.out.print(i + 1 + " ");
            }


        }
    }
}