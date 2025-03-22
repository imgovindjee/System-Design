package pkgBasic.OOPS.Association.ManyToMany;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

    private String teacherName;
    private List<Student> studentList;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
        this.studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void showStudent() {
        System.out.println(teacherName+" teaches: ");
        for (Student sl:studentList) {
            System.out.println(" - "+sl.getStudentName());
        }
    }

    public String getTeacherName() {
        return teacherName;
    }
}
