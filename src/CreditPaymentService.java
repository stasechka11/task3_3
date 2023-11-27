public class CreditPaymentService {
    public int calculate(int creditSum, int periodYears, double procentYear) {
        double procentMonth = procentYear / 12 / 100; // Ежемесячная процентная ставка

        /* Ежемесячный (аннуитетный) платеж по формуле:
        (СК * МП * (1 + МП)^n) / (((1 + МП)^n) - 1), где
        СК - сумма кредита
        МП - ежемесячная процентная ставка
        n - срок кредита в месяцах
         */

        int monthPayment = (int) ((creditSum * procentMonth * Math.pow((1 + procentMonth), periodYears * 12)) / (Math.pow((1 + procentMonth), periodYears * 12) - 1));

        return monthPayment;
    }
}
