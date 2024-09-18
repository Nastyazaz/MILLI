import java.util.Scanner;

class BonusMilesCalculator {
    public static void main(String[] args) {
        // Переменные для хранения стоимости билета и количества бонусных миль
        double costOfTicket = 0.0;
        double bonusMiles = 0.0;

        // Чтение стоимости билета с консоли
        System.out.print("Введите стоимость вашего билета в рублях:");
        try (Scanner scanner = new Scanner(System.in)) {
            costOfTicket = scanner.nextDouble();
        } catch (Exception e) {
            System.err.println("Error reading input: " + e.getMessage());
            return;
        }

        // Расчет количества бонусных миль
        bonusMiles = costOfTicket * (1.0 / 20.0);

        // Округление до целого числа
        long roundedBonusMiles = (long) Math.ceil(bonusMiles);

        // Вывод результата
        System.out.println("Вам начислено " + roundedBonusMiles + " бонусных миль.");
    }
}