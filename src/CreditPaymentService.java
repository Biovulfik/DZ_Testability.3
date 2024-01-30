public class CreditPaymentService {

    public int calculator(int amount, double term, double bid) {
        double month = term * 12;
        double monthlyRate = bid / 12 / 100;
        double solution = 1 + monthlyRate;

        return (int) (amount * monthlyRate * (Math.pow(solution, month) / (Math.pow(solution, month) - 1)));
    }
}

