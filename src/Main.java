public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println();
        System.out.println("1 000 000 / 9.99% / 12 мес.");
        System.out.println("ежемесячный платеж: " +  service.calculate(1_000_000, 0.0999, 12));

        System.out.println();
        System.out.println("1 000 000 / 9.99% / 24 мес.");
        System.out.println("ежемесячный платеж: " +  service.calculate(1_000_000, 0.0999, 24));

        System.out.println();
        System.out.println("1 000 000 / 9.99% / 36 мес.");
        System.out.println("ежемесячный платеж: " +  service.calculate(1_000_000, 0.0999, 36));

    }
}
