package com.XX.LLD.PRACTICE.DesignCourseRegistrationSystem.Service;

import com.XX.LLD.PRACTICE.DesignCourseRegistrationSystem.Course;
import com.XX.LLD.PRACTICE.DesignCourseRegistrationSystem.Registration;
import com.XX.LLD.PRACTICE.DesignCourseRegistrationSystem.Student;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class CourseRegistrationService {

    private static CourseRegistrationService courseRegistrationService;
    private Map<String, Course> courseMap;
    private Map<String, Student> studentMap;
    private List<Registration> registrationList;

    private CourseRegistrationService(){
        this.courseMap = new ConcurrentHashMap<>();
        this.studentMap = new ConcurrentHashMap<>();
        this.registrationList = new CopyOnWriteArrayList<>();
    }

    public static synchronized CourseRegistrationService getInstance(){
        if(courseRegistrationService == null){
            courseRegistrationService = new CourseRegistrationService();
        }
        return courseRegistrationService;
    }

    public void addCourse(Course course){
        courseMap.put(course.getCourseCode(), course);
    }

    public void addStudent(Student student){
        studentMap.put(student.getStudentID(), student);
    }

    public List<Course> searchCourses(String query){
        List<Course> courseList = new CopyOnWriteArrayList<>();
        for (Course course:courseMap.values()){
            if(course.getCourseCode().contains(query) || course.getCourseName().contains(query)){
                courseList.add(course);
            }
        }
        return courseList;
    }

    public synchronized boolean registerCourse(Student student, Course course){
        if(course.getEnrolledStudents() < course.getMaxCourseCapacity()){
            Registration registration = new Registration(student, course, new Timestamp(System.currentTimeMillis()));
            registrationList.add(registration);

            student.getRegisteredCourses().add(course);
            course.setEnrolledStudents(course.getEnrolledStudents()+1);
            notifyObservers(course);
            return true;
        }
        return false;
    }

    public List<Course> getRegisteredCourses(Student student){
        return student.getRegisteredCourses();
    }

    private void notifyObservers(Course course){
        System.out.println("Registration Successfully for the course - "+course.getCourseName());

//        UI-----part
    }
}
