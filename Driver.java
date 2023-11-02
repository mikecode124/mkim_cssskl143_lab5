public class Driver {
    public static void main(String[] args) {
        Student student = new Student("Grover", 3.1);
        System.out.println(student);
        student.setName("Grover Miami");
        System.out.println(student);

        MiniStudent bob = new MiniStudent(3.4, "bob");
        System.out.println(bob);
    }
}