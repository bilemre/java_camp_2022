package entities;

public class Courses {
    private int id;
    private String name;
    private double price;
    private String instructorName;
    private String categoryName;

    public Courses() {
    }

    public Courses(int id, String name, double price, String instructorName, String categoryName) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.instructorName = instructorName;
        this.categoryName = categoryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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
}
