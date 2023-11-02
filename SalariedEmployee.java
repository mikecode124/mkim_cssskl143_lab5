/**
 * This worker calculates her weekly pay differently than a hourly worker does, so
 we override the calculateWeeklyPay method
 */
public class SalariedEmployee extends Employee {
    private double monthlyPay;
    public SalariedEmployee() {
        super();
    }
    public SalariedEmployee(String name, int social) {
        super(name, social);
    }
    public SalariedEmployee(String name, int social, double pay) {
        super(name, social);
        if (pay > 0.0) {
            monthlyPay = pay;
        }
    }
    public double getWeeklyPay() {
        return monthlyPay / 4;
    }
}