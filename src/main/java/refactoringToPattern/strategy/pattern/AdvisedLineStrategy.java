package refactoringToPattern.strategy.pattern;

public class AdvisedLineStrategy extends Strategy {

    public double capital(Loan loan) {
        if (loan.getUnusedPercentage() != 1.0) {
            return loan.commitment() * loan.getUnusedPercentage() * loan.duration() * loan.riskFactor();
        } else {
            return (loan.outstandingRiskAmount() * loan.duration() * loan.riskFactor())
                + (loan.unusedRiskAmount() * loan.duration() * loan.unusedRiskFactor());
        }

    }
}
