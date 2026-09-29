package classes;
public class GasolineCar extends Car {
    private int Or_engineDisplacement;

    public GasolineCar(){
        super();
    }

    public GasolineCar(String brand,
                       String model,
                       int engineDisplacement,
                       double weight,
                       double price) {
        super(brand, model, weight, price);
        Or_engineDisplacement = engineDisplacement;}

    public int getEngineDisplacement() {
        return Or_engineDisplacement;
    }

    public void setEngineDisplacement(int engineDisplacement) {
        Or_engineDisplacement = engineDisplacement;
    }

    @Override
    public double calAnnualTax() {
        double tax = 0;

        if (Or_engineDisplacement <= 600) {
            tax = Or_engineDisplacement * 0.50;

        } else if (Or_engineDisplacement <= 1800) {
            tax = (600 * 0.50)
                + ((Or_engineDisplacement - 600) * 1.50);

        } else {
            tax = (600 * 0.50)
                + (1200 * 1.50)
                + ((Or_engineDisplacement - 1800) * 4.00);
        }
         return tax;}
    
}
