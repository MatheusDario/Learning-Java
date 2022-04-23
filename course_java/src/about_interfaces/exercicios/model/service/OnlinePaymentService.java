package about_interfaces.exercicios.model.service;

public interface OnlinePaymentService {
    double paymentFee(double amount);
    double interest(double amount, int months);
}
