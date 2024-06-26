package models;

import enums.AddressType;

/**
 * @author gauravkabra
 * @since 2024
 */

public class Address {
    private String street;
    private String city;
    private String state;
    private String pinCode;
    private AddressType addressType;

    public Address() {
    }

    public Address(String street, String city, String state, String pinCode, AddressType addressType) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
        this.addressType = addressType;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public AddressType getAddressType() {
        return addressType;
    }

    public void setAddressType(AddressType addressType) {
        this.addressType = addressType;
    }
}
