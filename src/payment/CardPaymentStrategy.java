package payment;

/**
 * @author gauravkabra
 * @since 2024
 */

public abstract class CardPaymentStrategy implements PaymentStrategy {
    String cardNumber;
    String cvv;
    String expiryDate;
}
