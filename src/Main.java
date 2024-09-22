

class Main {
    public static void main(String[] args) {
        // Переменные для хранения стоимости билета и количества бонусных миль
        int costOfTicket = 13676;
        int bonusMiles = 0;


        // Расчет количества бонусных миль
        bonusMiles = (int) (costOfTicket * (1.0 / 20.0));

        // Округление до целого числа
        long roundedBonusMiles = (long) Math.ceil(bonusMiles);

        // Вывод результата
        System.out.println("Вам начислено " + roundedBonusMiles + " бонусных миль.");
    }
}
