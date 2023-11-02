public class PermanentHire extends SalariedEmployee {
    public double MONTHLY_SALARY = 5000;

    /*
    A constructor with parameters for the name and social security number of the permanent hire.
    A constructor with parameters for the name, social security number, and monthly salary of the permanent hire.
    */
    public PermanentHire(String name, int social) {
        super(name, social);
    }
    public PermanentHire(String name, int social, double MONTHLY_SALARY) {
        super(name, social);
        this.MONTHLY_SALARY = MONTHLY_SALARY;
    }
    public double getWeeklyPay() {
        return MONTHLY_SALARY;
    }
}
