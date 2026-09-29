package classes;
public abstract class Car{
    private String Or_brand;
    private String Or_model;
    private double Or_weight;
    private double Or_price;

    public Car(){

    }

    public Car(String brand,
               String model,
               double weight,
               double price){

            Or_brand = brand;
            Or_model = model;
            Or_weight = weight;
            Or_price = price;}

    //setter getter
    public String getBrand(){
        return Or_brand; 
    }

    public void setBrand(String brand){
        Or_brand = brand; 
    }

    public String getModel(){
        return Or_model; 
    }

    public void setModel(String model){
        Or_model = model; 
    }

    public double getWeight(){
        return Or_weight; 
    }

    public void setWeight(double weight){
        Or_weight = weight; 
    }

    public double getPrice(){
        return Or_price; 
    }

    public void setPrice(double Price){
        Or_price = Price; 
    }

    //abstract Method 
    public abstract double calAnnualTax();
}