package kodlamaioWeb.entities;

public class Courses {
    public Courses(int courseId, String courseName, String instructorName, String categoryName, int price) {

        this.courseId = courseId;
        this.courseName = courseName;
        this.instructorName = instructorName;
        this.price = price;
        this.categoryName = categoryName;
    }


    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int courseId;
    private String courseName;
    private String instructorName;
    private String categoryName;
    private int price;


}
