package models;

import java.util.List;

/**
 * @author gauravkabra
 * @since 2024
 */

public class Customer extends Person {
    private String id;
    private boolean isPremiumUser;
    private List<Address> addresses;
}
