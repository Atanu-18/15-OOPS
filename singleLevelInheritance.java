//Base class
class Shape {
    public void area() {
        System.out.println("displays area");
    }
}

// derived class
class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}

public class singleLevelInheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();

        t1.area(); // Parent class method
        t1.area(10, 5);  // Child class method with area formula
    }
}
