package app.view;

public enum InterestRate {
    TEN(0.10),
    TWENTY(0.20),
    TWENTY_FIVE(0.25),
    FOURTY(0.40);

    private double rate;

    InterestRate(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }
}
