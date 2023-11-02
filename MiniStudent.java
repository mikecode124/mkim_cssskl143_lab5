public class MiniStudent extends Student {
    private String name;
    private int age;
    public MiniStudent(double gpa, String name, int age) {
        super(name, gpa);
        this.age = age;
    }
    public MiniStudent(double gpa, String name) {
        super(name, gpa);
    }
}
