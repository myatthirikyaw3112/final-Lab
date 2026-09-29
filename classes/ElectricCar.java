package classes;
public class ElectricCar extends Car {
    public ElectricCar(){
        super();
    }

    public ElectricCar(String brand,
                       String model,
                       double weight,
                       double price) {
        super(brand, model, weight, price);}

    @Override
    public double calAnnualTax() {

        double weight = getWeight();

        if (weight <= 500) {
            return 15;} 
        
        else if (weight <= 750) {
            return 30;}

        else if (weight <= 1000) {
            return 45;}

        else if (weight <= 1250) {
            return 80;}

        else if (weight <= 1500) {
            return 100;} 

        else if (weight <= 1750) {
            return 130;}

        else if (weight <= 2000) {
            return 160;}
        
        else if (weight <= 2000) {
            return 160;}

        else if (weight <= 2500) {
            return 190;}

        else if (weight <= 3000) {
            return 220;}

        else if (weight <= 3500) {
            return 240;}

        else if (weight <= 4000) {
            return 260;}

        else if (weight <= 4500) {
            return 280;}

        else if (weight <= 5000) {
            return 300;}

        else if (weight <= 6000) {
            return 320;}

        else if (weight <= 7000) {
            return 340;}

        else {
            return 360;
        }
    }
}


