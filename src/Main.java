public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amountCredit = 1_000_000;
        int term = 36;
        double procent = 9.99;
        int payment = service.calculate(amountCredit, term, procent);
        System.out.println(payment);
    }
}