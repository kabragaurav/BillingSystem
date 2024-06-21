package models;

import java.util.List;

import static utils.BillingSystemConstants.CUSTOMER_ID_PREFIX;

/**
 * @author gauravkabra
 * @since 2024
 */

public class Customer extends Person {
    private static long nextId = -1;

    private String id;
    private Boolean isPremiumUser;
    private List<Address> addresses;

    public Customer() {
        this.id = generateId();
    }

    public Customer(String name, List<String> contactNumbers, List<String> emails, boolean isPremiumUser, List<Address> addresses) {
        super(name, contactNumbers, emails);
        this.id = generateId();
        this.isPremiumUser = isPremiumUser;
        this.addresses = addresses;
    }

    private String generateId() {
        nextId++;
        return CUSTOMER_ID_PREFIX + nextId;
    }

    public String getId() {
        return id;
    }

    public boolean isPremiumUser() {
        return isPremiumUser;
    }

    public void setPremiumUser(boolean premiumUser) {
        isPremiumUser = premiumUser;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
