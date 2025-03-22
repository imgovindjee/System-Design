package com.XX.LLD.PRACTICE.DesignCourseRegistrationSystem.ServiceImplementation;

import com.XX.LLD.PRACTICE.DesignCourseRegistrationSystem.Course;
import com.XX.LLD.PRACTICE.DesignCourseRegistrationSystem.Service.CourseRegistrationService;
import com.XX.LLD.PRACTICE.DesignCourseRegistrationSystem.Student;

import java.util.ArrayList;
import java.util.List;

public class CourseRegistrationServiceImplementation {

    public static void run(){
//        instance creation
        CourseRegistrationService courseRegistrationService = CourseRegistrationService.getInstance();

//        create courses
        Course course1 = new Course("CS101", "Java Programming", "John Doe", 50, 0);
        Course course2 = new Course("CS201", "Algorithms Analysis", "QWERTY", 50, 0);
        Course course3 = new Course("CS301", "Computer Network", "AKSHARA", 50, 0);
        courseRegistrationService.addCourse(course1);
        courseRegistrationService.addCourse(course2);
        courseRegistrationService.addCourse(course3);

//        create student
        Student student1 = new Student("1", "Alice", "alice@gmail.com", new ArrayList<>());
        Student student2 = new Student("2", "Bob", "bob@gmail.com", new ArrayList<>());
        Student student3 = new Student("3", "Akaay", "akaay@gmail.com", new ArrayList<>());
        Student student4 = new Student("4", "Shubham", "shubham@gmail.com", new ArrayList<>());
        courseRegistrationService.addStudent(student1);
        courseRegistrationService.addStudent(student2);
        courseRegistrationService.addStudent(student3);
        courseRegistrationService.addStudent(student4);

//        search course
        List<Course> searchCourse = courseRegistrationService.searchCourses("CS");
        System.out.println("\n--------------------------Search Course--------------------------");
        for (Course course:searchCourse){
            System.out.println("CourseCode: "+course.getCourseCode());
            System.out.println("CourseName: "+course.getCourseName());
            System.out.println();
        }

//        Register course for student
        boolean registered1 = courseRegistrationService.registerCourse(student1, course1);
        boolean registered2 = courseRegistrationService.registerCourse(student1, course2);
        boolean registered3 = courseRegistrationService.registerCourse(student2, course1);
        boolean registered4 = courseRegistrationService.registerCourse(student4, course2);
        boolean registered5 = courseRegistrationService.registerCourse(student3, course3);
        System.out.println("\n---------------------Registration Results---------------------------");
        System.out.println("Student 1 - Course 1: "+registered1);
        System.out.println("Student 1 - Course 2: "+registered2);
        System.out.println("Student 2 - Course 1: "+registered3);
        System.out.println("Student 4 - Course 2: "+registered4);
        System.out.println("Student 3 - Course 3: "+registered5);

//        Get registered course for students
        List<Course> registeredCourse = courseRegistrationService.getRegisteredCourses(student1);
        System.out.println("\n---------------Registered Course for student-1 -------------------------");
        for (Course course: registeredCourse){
            System.out.println("CourseCode: "+course.getCourseCode());
            System.out.println("CourseName: "+course.getCourseName());
            System.out.println();
        }

        registeredCourse = courseRegistrationService.getRegisteredCourses(student2);
        System.out.println("\n---------------Registered Course for student-2 -------------------------");
        for (Course course: registeredCourse){
            System.out.println("CourseCode: "+course.getCourseCode());
            System.out.println("CourseName: "+course.getCourseName());
            System.out.println();
        }

        registeredCourse = courseRegistrationService.getRegisteredCourses(student3);
        System.out.println("\n---------------Registered Course for student-3 -------------------------");
        for (Course course: registeredCourse){
            System.out.println("CourseCode: "+course.getCourseCode());
            System.out.println("CourseName: "+course.getCourseName());
            System.out.println();
        }

        registeredCourse = courseRegistrationService.getRegisteredCourses(student4);
        System.out.println("\n---------------Registered Course for student-4 -------------------------");
        for (Course course: registeredCourse){
            System.out.println("CourseCode: "+course.getCourseCode());
            System.out.println("CourseName: "+course.getCourseName());
            System.out.println();
        }
    }
}
