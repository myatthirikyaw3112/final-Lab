package classes;

public class InstallmentCal {

    public double calLoanAmount(double price, double downPercent) {

        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than 0");
        }

        if (downPercent < 0 || downPercent > 100) {
            throw new IllegalArgumentException(
                    "Down payment must be between 0 and 100"
            );
        }

        double downPayment = price * downPercent / 100;

        return price - downPayment;
    }

    public double calInterest(double loanAmount,
                              double interestRate,
                              int months) {

        if (loanAmount < 0) {
            throw new IllegalArgumentException(
                    "Loan amount cannot be negative"
            );
        }

        if (interestRate < 0) {
            throw new IllegalArgumentException(
                    "Interest rate cannot be negative"
            );
        }

        if (months <= 0) {
            throw new IllegalArgumentException(
                    "Months must be greater than 0"
            );
        }

        return loanAmount * (interestRate / 100) * (months / 12.0);
    }

    public double calMonthlyInstallment(double loanAmount,
                                        double interest,
                                        int months) {

        if (months <= 0) {
            throw new IllegalArgumentException(
                    "Months must be greater than 0"
            );
        }

        return (loanAmount + interest) / months;
    }
}