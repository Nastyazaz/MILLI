

class main {
    public static void main(String[] args) {
        // Переменные для хранения стоимости билета и количества бонусных миль
        int costOfTicket = 3500;
        double bonusMiles = 0.0;


        // Расчет количества бонусных миль
        bonusMiles = costOfTicket * (1.0 / 20.0);

        // Округление до целого числа
        long roundedBonusMiles = (long) Math.ceil(bonusMiles);

        // Вывод результата
        System.out.println("Вам начислено " + roundedBonusMiles + " бонусных миль.");
    }
}
