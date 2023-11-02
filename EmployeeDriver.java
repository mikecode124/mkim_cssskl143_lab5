import java.util.ArrayList;
import java.util.List;
/*
 * Driver
 * Lab
 *
 * A simple driver to exercise the Employee hierarchy
 */
public class EmployeeDriver {
    public static void main(String[] args) {
        Accountant emp1 = new Accountant("Frank Reynolds", 123456789);
        Accountant emp2 = new Accountant( "Mac McDonald", 55555555,10000);
        HourlyEmployee emp3 = new HourlyEmployee( "Deandra Reynolds ", 11111111);
        SalariedEmployee emp4 = new SalariedEmployee("Dennis Reynolds", 222222222, 5000);
        HourlyEmployee emp5 = new HourlyEmployee("Charlie Kelly", 11111111,20);

        PermanentHire emp6 = new PermanentHire("Mike", 1234, 100.11);
        PermanentHire emp7 = new PermanentHire("Bro", 2345, 999999.99);

        PartTimeEmployee emp8 = new PartTimeEmployee("Mike2", 3456);
        PartTimeEmployee emp9 = new PartTimeEmployee("Bro2", 4567);


        // Create a ColorWithAlpha object
        ColorWithAlpha pme1 = new ColorWithAlpha(50);

        // and build a set of workers, all of which are employees
        List<Employee> employees = new ArrayList<>();


        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
        employees.add(emp6);
        employees.add(emp7);
        employees.add(emp8);
        employees.add(emp9);

        // employees.add(pme1);  // it asks me to change the list type
        // we could potentially have all the classes implement the same interface. ie public interface writable(){}.
        // then change the list to the shared interface type. This would allow for ColorsWithAlpha object pme1
        // to be added to the employees<> Arraylist

// TODO Add your PermanentHire and Consultant objects to the list
// this code doesn't need to change, even if you add 10 new employee classes and
// add 102 new employees - this is an example of generic code that can be written
// when inheritance hierarchies are in use
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " makes " +
                    employee.getWeeklyPay() + " per week.");
        }
    }
}