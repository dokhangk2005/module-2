package ss3.bai_tap.CircleandCylinder;

public class Display {
    public static void main(String[] args) {
        Circle circle = new Circle(1,"red");
        Cylinder cylinder = new Cylinder(1,5,"blue");
        System.out.println(cylinder);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getVolume());
    }
}
