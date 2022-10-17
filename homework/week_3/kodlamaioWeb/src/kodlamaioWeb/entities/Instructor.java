package kodlamaioWeb.entities;

public class Instructor {
    private int instructorId;
    private String instructorName;
    private String[] courseOfInstructor;


    public  Instructor(int instructorId , String instructorName,String[]courseOfInstructor){
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


    public String[] getCourseOfInstructor() {
        return courseOfInstructor;
    }

    public void setCourseOfInstructor(String[] courseOfInstructor) {
        this.courseOfInstructor = courseOfInstructor;
    }
}
