package Dietel;

public class Car {
    private String model;
    private String year;
    private double price;

    public Car(String model, String year, double price) {
        validatePrice(price);
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setPrice(double price) {
        validatePrice(price);
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

   public double discountedPrice(double percentageDiscount) {
        if(percentageDiscount <= 0.0)throw new IllegalArgumentException
                (String.format("%sInvalid percentage discount", percentageDiscount));
        double discount = price * percentageDiscount / 100;
        return price - discount;
    }



    public static void validatePrice(double price){
        if(price <= 0.0 ) throw new IllegalArgumentException
                (String.format("%sThe price cannot be less than zero", price));
    }

}
