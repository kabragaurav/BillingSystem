package models;

import enums.ProductCategory;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author gauravkabra
 * @since 2024
 */

public class Product {
    String id;
    String name;
    String description;
    ProductCategory productCategory;
    String manufacturer;
    double price;
    double discount;
    Date mfgDate;
    Date expiryDate;
    boolean isEligibleForReturn;
    boolean isEligibleForReplacement;
    int returnOffset;
    int replacementOffset;
}
