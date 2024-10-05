public class ZADANIE_11_4 {
    public static void main(String[] args) {
        int[] rostchela = new int[12];

        int maxrost = 190;
        int minrost = 163;

        System.out.println("Сгенерированные числа находятся в пределах от " + minrost + " до " + maxrost);

        for (int i = 0; i < rostchela.length; i++){

            rostchela[i] = (int) ((Math.random() * (190 - 163 + 1) + 163));

            System.out.println(String.format("Рост пениса челикса № %d равен %d мм ", (i+1), rostchela[i]));
        }



    }
}
