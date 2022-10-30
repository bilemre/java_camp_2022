package entities;

import java.util.List;

public class instructor {
    private int instructorId;
    private String instructorName;
    List<String> courseOfInstructor;

    public instructor() {
    }

    public instructor(int instructorId, String instructorName, List<String> courseOfInstructor) {
        this.instructorId = instructorId;
        this.instructorName = instructorName;
        this.courseOfInstructor = courseOfInstructor;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public List<String> getCourseOfInstructor() {
        return courseOfInstructor;
    }

    public void setCourseOfInstructor(List<String> courseOfInstructor) {
        this.courseOfInstructor = courseOfInstructor;
    }
}
