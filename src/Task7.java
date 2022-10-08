public class Task7 {
    public static void main(String[] args) {
        int friday = 5;
        for (int i = 1; i <= 31; i++) {
            if ((i - 5) % 7 == 0){
                System.out.println("День " + i + " Сегодня - пятница. Не забудте сделать отчет!)");
            }

        }
    }
}
