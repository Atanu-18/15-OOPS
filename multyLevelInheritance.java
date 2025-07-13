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

// Second derived class (Multilevel inheritance)
class EquilateralTriangle extends Triangle {
    // Overriding the area method from Triangle
    //Override
    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}

public class multyLevelInheritance {
    public static void main(String[] args) {

        System.out.println("=== Triangle Object ===");
        Triangle t1 = new Triangle();

        t1.area(); // Parent class method
        t1.area(10, 5);  // Child class method with area formula

        System.out.println("\n=== EquilateralTriangle Object ===");
        EquilateralTriangle et = new EquilateralTriangle();
        et.area();            // Overridden method in EquilateralTriangle
        et.area(10, 5);       // Overridden method in EquilateralTriangle
    }
}
 