package models;


import java.time.LocalDateTime;
import java.util.List;

import static utils.BillingSystemConstants.INVOICE_ID_PREFIX;

/**
 * @author gauravkabra
 * @since 2024
 */

public class Invoice {
    private static long nextId = -1;

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

    public Invoice() {
        this.id = generateId();
    }

    private String generateId() {
        nextId++;
        return INVOICE_ID_PREFIX + nextId;
    }

    public String getId() {
        return id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public List<Product> getPurchasedProducts() {
        return purchasedProducts;
    }

    public void setPurchasedProducts(List<Product> purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public LocalDateTime getGenerationDateTime() {
        return generationDateTime;
    }

    public void setGenerationDateTime(LocalDateTime generationDateTime) {
        this.generationDateTime = generationDateTime;
    }

    public String getSignatureOfAuthority() {
        return signatureOfAuthority;
    }

    public void setSignatureOfAuthority(String signatureOfAuthority) {
        this.signatureOfAuthority = signatureOfAuthority;
    }

    public TaxInfo getTaxInfo() {
        return taxInfo;
    }

    public void setTaxInfo(TaxInfo taxInfo) {
        this.taxInfo = taxInfo;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Address getPurchaserAddress() {
        return purchaserAddress;
    }

    public void setPurchaserAddress(Address purchaserAddress) {
        this.purchaserAddress = purchaserAddress;
    }

    public Address getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(Address storeAddress) {
        this.storeAddress = storeAddress;
    }

    public PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
    }
}
