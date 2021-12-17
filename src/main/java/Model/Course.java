package Model;

import java.util.List;


public class Course implements Comparable<Course>{
    private String name;
    private long IDteacher;
    private int maxEnrollment;
    private List<Long> studentsEnrolled;
    private int credits;
    private long IDcourse;


    public Course(String name, long IDteacher, int maxEnrollment, int credits, long IDcourse, List<Long> students){
        this.name = name;
        this.IDteacher = IDteacher;
        this.maxEnrollment = maxEnrollment;
        this.studentsEnrolled = students;
        this.credits = credits;
        this.IDcourse = IDcourse;
    }


    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", IDteacher=" + IDteacher +
                ", maxEnrollment=" + maxEnrollment +
                ", enrolledStudents=" + studentsEnrolled +
                ", credits=" + credits +
                ", IDcourse=" + IDcourse +
                '}';
    }


    public void addStudent(long student) {
        studentsEnrolled.add(student);
    }


    public void deleteStudent(long student) {
        studentsEnrolled.remove(student);
    }


    public int getNumberOfStudents(){
        return studentsEnrolled.size();
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public long getTeacher() {
        return IDteacher;
    }


    public void setTeacher(long IDteacher) {
        this.IDteacher = IDteacher;

    }


    public int getMaxEnrollment() {
        return maxEnrollment;
    }


    public void setMaxEnrollment(int maxEnrollment) {
        if (this.getNumberOfStudents() > maxEnrollment) {
            this.maxEnrollment = maxEnrollment;
        }
    }


    public int getCredits() {
        return credits;
    }


    public void setCredits(int credits) {
        this.credits = credits;
    }


    public List<Long> getStudentsEnrolled() {
        return studentsEnrolled;
    }


    public void setStudentsEnrolled(List<Long> studentsEnrolled) {
        this.studentsEnrolled = studentsEnrolled;
    }

    public long getIDCourse() {
        return IDcourse;
    }

    @Override
    public int compareTo(Course o) {
        if (IDcourse == o.getIDCourse()) {
            return 1;
        }
        return 0;
    }
}
