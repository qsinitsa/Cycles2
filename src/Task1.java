public class Task1 {
    public static void main(String[] args) {
        int part = 15_000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total += part;
            month++;
        }
        System.out.println("Сумма накоплений " + total + " требуется месяцев " + month);

    }


}
