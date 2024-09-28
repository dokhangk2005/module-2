package ss5.bai_tap;

public class Circle {
    private double radius = 1;
    private String color = "red";

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    protected double getRadius() {
        return radius;
    }

    protected double getArea() {
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Radius: " + circle.getRadius() + " Area: " + circle.getArea());
    }
}
