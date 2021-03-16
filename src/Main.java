public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int payment = service.calculate(1_000_000, 1);
        System.out.println(payment);
        payment = service.calculate(1_000_000, 2);
        System.out.println(payment);
        payment = service.calculate(1_000_000, 3);
        System.out.println(payment);
    }
}
