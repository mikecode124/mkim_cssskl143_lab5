public class Accountant extends SalariedEmployee {
    public static final double MONTHLY_SALARY = 8000;
    public Accountant(String name, int social) {
        super(name, social, MONTHLY_SALARY);
    }
    public Accountant(String name, int social, double monthlyPay) {
        super(name, social, monthlyPay);
    }
}