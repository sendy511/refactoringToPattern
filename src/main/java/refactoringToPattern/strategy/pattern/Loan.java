package refactoringToPattern.strategy.pattern;

import java.util.Date;

public class Loan {

    private Date expiry;
    private Double maturity;
    private double commitment;
    private double outStanding;
    private double unUsedPercentage;

    private Loan(Date expiry, Double maturity, double commitment, Strategy strategy){
        this.expiry = expiry;
        this.maturity = maturity;
        this.commitment = commitment;
        this.strategy = strategy;
    }

    private Strategy strategy;

    public static Loan CreateLoan(Date expiry, Double maturity, double commitment)
        throws Exception {

        if (expiry == null && maturity != null) {
            return new Loan(expiry, maturity, commitment, new CommonStrategy());
        }

        if (expiry != null && maturity == null) {
            return new Loan(expiry, maturity, commitment, new AdvisedLineStrategy());
        }

        throw new Exception("Not supported");
    }

    public double captical(){
        return strategy.capital(this);
    }


    public double unusedRiskFactor() {
        return 100;
    }

    public double unusedRiskAmount() {
        return commitment - outStanding;
    }

    public double outstandingRiskAmount() {
        return outStanding;
    }

    public double getUnusedPercentage() {
        return this.unUsedPercentage;
    }

    public double riskFactor() {
        return 50;
    }

    public double duration() {
        if (expiry == null && maturity != null) {
            return weightedDuration();
        } else {
            return yearsTo(expiry);
        }
    }

    private double yearsTo(Date expiry) {
        return expiry.getYear();
    }

    private double weightedDuration() {
        return expiry.getYear() * 2;
    }

    public double commitment() {
        return 0;
    }
}
