package ss4.bai_tap;

public class fan {
    public static final int slow = 1;
    public static final int med= 2;
    public static final int fast = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public fan() {
        this.speed = slow;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getStatus() {
        return on;
    }

    public void setStatus(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        if (this.on) {
            return "Speed "+speed+", color: "+color+", radius: "+radius+", fan is on";
        } else {
            return "Color: "+color+", radius: "+radius+", fan is off";
        }
    }
    public static void main(String[] args) {
        fan fan1 = new fan();
        fan fan2 = new fan();
        fan1.setSpeed(fan.fast);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setStatus(true);
        System.out.println(fan1.toString());
        fan2.setSpeed(fan.med);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setStatus(false);
        System.out.println(fan2.toString());
    }
}
