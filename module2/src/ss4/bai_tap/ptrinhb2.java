package ss4.bai_tap;

import java.util.Scanner;

public class ptrinhb2 {
    public static class QuadraticEquation {
        private final double a;
        private final double b;
        private final double c;

        public QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getDiscriminant() {
            return b * b - 4 * a * c;
        }

        public String getRoot1() {
            double discriminant = getDiscriminant();
            if (discriminant >= 0) {
                return String.format("%.2f", (-b + Math.sqrt(discriminant)) / (2 * a));
            } else {
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
                return String.format("%.2f + %.2fi", realPart, imaginaryPart);
            }
        }

        public String getRoot2() {
            double discriminant = getDiscriminant();
            if (discriminant >= 0) {
                return String.format("%.2f", (-b - Math.sqrt(discriminant)) / (2 * a));
            } else {
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
                return String.format("%.2f - %.2fi", realPart, imaginaryPart);
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a, b, c: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            if (a == 0) {
                System.out.println("This is not a quadratic equation. 'a' cannot be zero.");
                return;
            }

            QuadraticEquation equation = new QuadraticEquation(a, b, c);
            double discriminant = equation.getDiscriminant();

            if (discriminant > 0) {
                System.out.println("nghiem kep: " + equation.getRoot1() + " and " + equation.getRoot2());
            } else if (discriminant == 0) {
                System.out.println("1 nghiem: " + equation.getRoot1());
            } else {
                System.out.println("2 nghiem: " + equation.getRoot1() + " and " + equation.getRoot2());
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}