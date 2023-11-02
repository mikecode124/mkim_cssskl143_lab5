public class PartTimeEmployee extends HourlyEmployee {


    public static final double HOURLY_RATE = 5;

    public PartTimeEmployee(String name, int social) {
        super(name, social);
    }

    public PartTimeEmployee(String name, int social, double monthlyPay) {
        super(name, social, monthlyPay);
    }

    public double getWeeklyPay() {
        return HOURLY_RATE * 20;
    }

}