package Workshop_27_10_2023_Car_Models.entities;

public class Car {
    private int id;
    private String name;
    private String brand;
    private double totalKm;
    private int modelYear;
    private String color;
    private double unitprice;

    public Car() {
    }

    public Car(int id, String name, String brand, double totalKm, int modelYear, String color, double unitprice) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.totalKm = totalKm;
        this.modelYear = modelYear;
        this.color = color;
        this.unitprice = unitprice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getTotalKm() {
        return totalKm;
    }

    public void setTotalKm(double totalKm) {
        this.totalKm = totalKm;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }
}