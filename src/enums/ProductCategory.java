package enums;

/**
 * @author gauravkabra
 * @since 2024
 */

public enum ProductCategory {
    BEVERAGE(30.0),
    GROCERY(10.0),
    ;

    private double taxRate;

    ProductCategory(double taxRate) {
        this.taxRate = taxRate;
    }

    public double getTaxRate() {
        return taxRate;
    }
}
