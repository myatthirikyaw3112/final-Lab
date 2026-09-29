package Test;

import classes.InstallmentCal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InstallmentCalTest {

    InstallmentCal cal = new InstallmentCal();

    // Given values
    double downPercent = 30;
    double interestRate = 1.89;
    int months = 60;


    // TOYOTA New YARIS Cross
    @Test
    void testToyota() {

        double price = 911000;

        double loan = cal.calLoanAmount(price, downPercent);
        double interest = cal.calInterest(loan, interestRate, months);
        double monthly = cal.calMonthlyInstallment(
                loan, interest, months
        );

        assertEquals(637700, loan, 0.01);
        assertEquals(60262.65, interest, 0.01);
        assertEquals(11632.71, monthly, 0.01);
    }


    // BYD Dolphin 490
    @Test
    void testBYD() {

        double price = 859999;

        double loan = cal.calLoanAmount(price, downPercent);
        double interest = cal.calInterest(loan, interestRate, months);
        double monthly = cal.calMonthlyInstallment(
                loan, interest, months
        );

        assertEquals(601999.30, loan, 0.01);
        assertEquals(56888.93, interest, 0.01);
        assertEquals(10981.47, monthly, 0.01);
    }


    // HONDA CR-V E 2023
    @Test
    void testHonda() {

        double price = 1419000;

        double loan = cal.calLoanAmount(price, downPercent);
        double interest = cal.calInterest(loan, interestRate, months);
        double monthly = cal.calMonthlyInstallment(
                loan, interest, months
        );

        assertEquals(993300, loan, 0.01);
        assertEquals(93866.85, interest, 0.01);
        assertEquals(18119.45, monthly, 0.01);
    }


    // AION ES ev 2023
    @Test
    void testAION() {

        double price = 850000;

        double loan = cal.calLoanAmount(price, downPercent);
        double interest = cal.calInterest(loan, interestRate, months);
        double monthly = cal.calMonthlyInstallment(
                loan, interest, months
        );

        assertEquals(595000, loan, 0.01);
        assertEquals(56227.50, interest, 0.01);
        assertEquals(10853.79, monthly, 0.01);
    }
}