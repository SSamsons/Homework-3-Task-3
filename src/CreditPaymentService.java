public class CreditPaymentService {
    int a1 = 1;
    int a2 = 12;
    public int calculate (int amount, int term, double procent) {
        double i = (procent / a2 / 100);
        double b1 = (a1 + i);
        double c1 = (Math.pow(b1, term));
        double c2 = (i * c1);
        double c3 = (c1 - 1);
        double k = (c2 / c3);
        double a = (k * amount);
        return (int) a;
    }
}
