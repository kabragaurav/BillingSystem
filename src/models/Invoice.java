package models;


import java.time.LocalDateTime;
import java.util.List;

/**
 * @author gauravkabra
 * @since 2024
 */

public class Invoice {
    private String id;
    private String customerId;
    private List<Product> purchasedProducts;
    private double totalPrice;
    private double totalDiscount;
    private String transactionId;
    private LocalDateTime generationDateTime;
    private String signatureOfAuthority;
    private TaxInfo taxInfo;
    private Address shippingAddress;
    private Address purchaserAddress;
    private Address storeAddress;
    private PaymentDetails paymentDetails;
}
