public class Student extends Person {
    private double gpa;

    public Student(String name, double gpa) {
        super(name);
        this.gpa = gpa;
    }

    public Student(double gpa) {
        this.gpa = gpa;
    }

    public Student() {

    }

    public double getGpa() {
        return this.gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return getName() + ", GPA: " + this.gpa;
    }
}