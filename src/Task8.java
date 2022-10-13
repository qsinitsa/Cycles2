public class Task8 {
    public static void main(String[] args) {
        int period = 79;
        for (int i = 0; ; i += 79) {
            if (i > 1822 && i <= 2022) {
                System.out.println("комета пролетала в " + i);
            }
            if (i > 2022 && i % 79 == 0) {
                System.out.println("В следующий раз комета пролетит в " + i + " году");
                break;
            }

        }
    }
}
