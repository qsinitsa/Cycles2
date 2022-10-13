public class Task6 {
    public static void main(String[] args) {
        int total = 15_000;
        int month = 9 * 12;
        for (int i = 1; i <= month; i++) {
            total += total / 100 * 7;
            if (i % 6 == 0) {
                System.out.println("месяц " + i + " накопления составляют " + total);
            }

        }
        System.out.println("За 9 лет удалось накопить " + total);

    }
}
