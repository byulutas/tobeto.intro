package Workshop_25_10_2023_E_Ticaret.entities;

public class Product {
    public Product(int id, String productName, double unitPrice) {
        this.id = id;
        this.productName = productName;
        this.unitPrice = unitPrice;
    }

    private int id ;
    private String productName;
    private double unitPrice;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
