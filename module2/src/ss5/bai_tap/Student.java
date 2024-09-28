package ss5.bai_tap;

public class Student {
    private String name = "Khang";
    private String classes = "C06";
    public Student() {}

    protected void setName(String name) {
        this.name = name;
    }

    protected void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s);
        s.setName("Linh");
        s.setClasses("C07");
        System.out.println(s);
    }
}
