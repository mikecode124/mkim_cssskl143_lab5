/**
 * This worker calculates her weekly pay differently than a salaried worker does,
 so we override the calculateWeeklyPay method
 */
public class HourlyEmployee extends Employee {
    private double hourlyPay;
    public static final double MINIMUM_WAGE = 10.0;
    public HourlyEmployee() {
        super();
    }
    public HourlyEmployee(String name, int social) {
        super(name, social);
        hourlyPay = MINIMUM_WAGE;
    }
    public HourlyEmployee(String name, int social, double hourlyPay) {
        super(name, social);
        if (hourlyPay < MINIMUM_WAGE) {
            throw new IllegalArgumentException("Pay should be at least minimum wage of " + MINIMUM_WAGE);
        }
        this.hourlyPay = hourlyPay;
    }
    // notice how we override this method to act accordingly for an hourly wage
    public double getWeeklyPay() {
        return hourlyPay * 40;
    }
}