package pkgBasic.OOPS.Association.ManyToMany;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Miss Priyanka");
        Teacher teacher2 = new Teacher("Miss Samishaka");

        Student student1 = new Student("Student1");
        Student student2 = new Student("Student2");

        teacher1.addStudent(student1);
        teacher1.addStudent(student2);
        teacher2.addStudent(student1);

        teacher1.showStudent();
        teacher2.showStudent();
    }
}
