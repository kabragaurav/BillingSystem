package extSDKs;

/**
 * @author gauravkabra
 * @since 2024
 */

public class AmazonPay {

    public void makePayment(String customerId, String storeId, double amount) {
        System.out.println("Paid an amount of" + amount + " via amazon pay!");
    }

}
