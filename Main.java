import classes.Car;
import classes.GasolineCar;
import classes.ElectricCar;
import classes.InstallmentCal;
import classes.CSVmanager;

public class Main {

    public static void main(String[] args) {

        // Create cars
        Car car1 = new GasolineCar("TOYOTA",
                                   "New YARIS Cross",
                                   1500,
                                   1285,
                                   911000);

        Car car2 = new ElectricCar(
                "BYD",
                "Dolphin",
                1658,
                859999
        );

        Car car3 = new GasolineCar("HONDA",
                                   "CR-V E 2023",
                                   1500,
                                   1743,
                                   1419000);

        Car car4 = new ElectricCar(
                "AION",
                "ES ev 2023",
                1290,
                850000
        );

        // Display car information
        System.out.println("Car 1");
        System.out.println("Brand: " + car1.getBrand());
        System.out.println("Model: " + car1.getModel());
        System.out.println("Weight: " + car1.getWeight());
        System.out.println("Price: " + car1.getPrice());
        System.out.println("Annual Tax: " + car1.calAnnualTax());

        System.out.println();

        System.out.println("Car 2");
        System.out.println("Brand: " + car2.getBrand());
        System.out.println("Model: " + car2.getModel());
        System.out.println("Weight: " + car2.getWeight());
        System.out.println("Price: " + car2.getPrice());
        System.out.println("Annual Tax: " + car2.calAnnualTax());

        System.out.println();

        System.out.println("Car 3");
        System.out.println("Brand: " + car3.getBrand());
        System.out.println("Model: " + car3.getModel());
        System.out.println("Weight: " + car3.getWeight());
        System.out.println("Price: " + car3.getPrice());
        System.out.println("Annual Tax: " + car3.calAnnualTax());

        System.out.println();

        System.out.println("Car 4");
        System.out.println("Brand: " + car4.getBrand());
        System.out.println("Model: " + car4.getModel());
        System.out.println("Weight: " + car4.getWeight());
        System.out.println("Price: " + car4.getPrice());
        System.out.println("Annual Tax: " + car4.calAnnualTax());

        System.out.println();

        // Installment calculation
        InstallmentCal installment = new InstallmentCal();

        double downPercent = 30;
        double interestRate = 1.89;
        int months = 60;

        double loanAmount =
                installment.calLoanAmount(
                        car1.getPrice(),
                        downPercent
                );

        double interest =
                installment.calInterest(
                        loanAmount,
                        interestRate,
                        months
                );

        double monthly =
                installment.calMonthlyInstallment(
                        loanAmount,
                        interest,
                        months
                );

        //Display 
        System.out.println();
        System.out.println("Installment for " + car1.getModel());
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Interest: " + interest);
        System.out.println("Monthly Installment: " + monthly);

        System.out.println();
        System.out.println("Installment for " + car2.getModel());
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Interest: " + interest);
        System.out.println("Monthly Installment: " + monthly);

        System.out.println();
        System.out.println("Installment for " + car3.getModel());
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Interest: " + interest);
        System.out.println("Monthly Installment: " + monthly);

        System.out.println();
        System.out.println("Installment for " + car4.getModel());
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Interest: " + interest);
        System.out.println("Monthly Installment: " + monthly);

        //I/O
        CSVmanager csv = new CSVmanager();
        csv.saveCars();
        System.out.println("\nReading CSV:");
        csv.loadCars();
    }
}