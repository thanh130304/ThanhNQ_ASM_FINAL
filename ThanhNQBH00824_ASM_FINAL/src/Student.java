public class Student {
    private String id;
    private String name;
    private double marks;

    // Constructor
    public Student(String id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = Math.round(marks * 10.0) / 10.0; // Round marks to 1 decimal place
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    // To string method to display student info
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
    }
}
