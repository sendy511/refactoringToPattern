package refactoringToPattern.strategy.no_pattern;

import java.util.Date;

public class Loan {

    private Date expiry;
    private Double maturity;
    private double commitment;
    private double outStanding;
    private double unUsedPercentage;

    public double captical(){
        if (expiry == null && maturity != null) {
            return commitment * duration() * riskFactor();
        }

        if (expiry != null && maturity == null) {
            if (getUnusedPercentage() != 1.0) {
                return commitment * getUnusedPercentage() * duration() * riskFactor();
            } else {
                return (outstandingRiskAmount() * duration() * riskFactor())
                + (unusedRiskAmount() * duration() * unusedRiskFactor());
            }
        }

        return 0.0;
    }

    private double unusedRiskFactor() {
        return 100;
    }

    private double unusedRiskAmount() {
        return commitment - outStanding;
    }

    private double outstandingRiskAmount() {
        return outStanding;
    }

    private double getUnusedPercentage() {
        return this.unUsedPercentage;
    }

    private double riskFactor() {
        return 50;
    }

    private double duration() {
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

}
