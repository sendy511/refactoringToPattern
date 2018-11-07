package refactoringToPattern.strategy.pattern;

public class CommonStrategy extends Strategy {

    public double capital(Loan loan) {
        return loan.commitment() * loan.duration() * loan.riskFactor();
    }
}
