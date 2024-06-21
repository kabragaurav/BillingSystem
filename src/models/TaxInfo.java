package models;

/**
 * @author gauravkabra
 * @since 2024
 */

public class TaxInfo {
    private String gstIn;
    private double cgst;
    private double sgst;

    public double calculateTax(Invoice invoice) {
        return 0.0;
    }
}
