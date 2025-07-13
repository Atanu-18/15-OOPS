
//Base class
class Shape {
    public void area() {
        System.out.println("displays area");
    }
}

// First derived class
class Triangle extends Shape {
    // Overloading
    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}

// Second derived class (dutoi base class er opor nirvor) 
class Circle extends Shape {
    public void area(int r) {
        System.out.println(3.14 * r * r);
    }
}

public class hierarchialLevelInheritance {
    public static void main(String[] args) {

        System.out.println("=== Triangle Object ===");
        Triangle t1 = new Triangle();

        t1.area(); // Parent class method
        t1.area(10, 5);  // Child class method with area formula

        System.out.println("=== Cricle Object ===");
        Circle c1  = new Circle();

        c1.area();
        c1.area(5);
    }
}
 
