class Shape {
    String color;

}

class Triangle extends Shape {

}
public class inheritance1 {
    public static void main(String[] args) {
        //object
        Triangle t1 = new Triangle();
        t1.color = "red";

        System.out.println(t1.color);
    }
}
