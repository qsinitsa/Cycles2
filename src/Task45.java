public class Task45 {
    public static void main(String[] args) {
        int total = 15_000;
        int month = 0;
        while (total < 12_000_000) {
            month++;
            total = total + total / 100 * 7;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " Сумма " + total);
            }
        }
        System.out.println("Чтобы накопить 12 миллионов потребутеся " + month + " месяцев");
    }
}
