public class CreditPaymentService {
    public int calculate(int amount, int years) {
        float percent = 0.0999F;
        int months = years * 12;
        float monthPercent = percent / 12;
        float coefficient = (float) Math.pow(1 + monthPercent, months);
        int payment = (int) (amount * ((monthPercent * coefficient) / (coefficient - 1)));
        return payment;
    }
}
