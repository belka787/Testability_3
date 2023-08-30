public class CreditPaymentService {
    public int calculate (int sum, double percent, int month){

        return (int) (sum * ((percent / 12) * Math.pow(1 + (percent / 12), month)) / (Math.pow(1 + (percent / 12), month) - 1));
    }
}
