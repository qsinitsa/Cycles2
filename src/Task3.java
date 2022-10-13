public class Task3 {
    public static void main(String[] args) {
        int popualtion = 12_000_000;
        int birthPer1000 = 17;
        int deathPer1000 = 8;
        int thousands;
        for (int i = 1; i <= 10; i++) {
            thousands = popualtion / 1000;
            popualtion += (birthPer1000 * thousands - deathPer1000 * thousands);
            System.out.println(i + " год. Население составляет " + popualtion);

        }
    }
}
