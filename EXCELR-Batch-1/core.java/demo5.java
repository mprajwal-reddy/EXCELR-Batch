public class Demo5 {
    public static void main(String[] args) {
        double radius = 5.0; // Example radius
        double area = calculateArea(radius);
        double circumference = calculateCircumference(radius);
        double diameter = calculateDiameter(radius);

        System.out.println("The area of the circle with radius " + radius + " is: " + area);
        System.out.println("The circumference of the circle with radius " + radius + " is: " + circumference);
        System.out.println("The diameter of the circle with radius " + radius + " is: " + diameter);
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculateDiameter(double radius) {
        return 2 * radius;
    }
}