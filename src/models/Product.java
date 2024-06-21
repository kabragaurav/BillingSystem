package models;

import enums.ProductCategory;

import java.util.Date;

import static utils.BillingSystemConstants.PRODUCT_ID_PREFIX;

/**
 * @author gauravkabra
 * @since 2024
 */

public class Product {
    private static long nextId = -1;

    String id;
    String name;
    String description;
    ProductCategory productCategory;
    String manufacturer;
    double price;
    Double discount;
    Date mfgDate;
    Date expiryDate;
    Boolean isEligibleForReturn;
    Boolean isEligibleForReplacement;
    Integer returnOffset;
    Integer replacementOffset;

    public Product() {
        this.id = generateId();
    }

    private String generateId() {
        nextId++;
        return PRODUCT_ID_PREFIX + nextId;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Date getMfgDate() {
        return mfgDate;
    }

    public void setMfgDate(Date mfgDate) {
        this.mfgDate = mfgDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Boolean getEligibleForReturn() {
        return isEligibleForReturn;
    }

    public void setEligibleForReturn(Boolean eligibleForReturn) {
        isEligibleForReturn = eligibleForReturn;
    }

    public Boolean getEligibleForReplacement() {
        return isEligibleForReplacement;
    }

    public void setEligibleForReplacement(Boolean eligibleForReplacement) {
        isEligibleForReplacement = eligibleForReplacement;
    }

    public Integer getReturnOffset() {
        return returnOffset;
    }

    public void setReturnOffset(Integer returnOffset) {
        this.returnOffset = returnOffset;
    }

    public Integer getReplacementOffset() {
        return replacementOffset;
    }

    public void setReplacementOffset(Integer replacementOffset) {
        this.replacementOffset = replacementOffset;
    }
}
