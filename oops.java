class Pen {
    String color;
    String type;  //ballpoint, gel

    //method
    public void write() {
        System.out.println("writing something");
    }

    public void printColor() {
        System.out.println(this.color);
    }

    public void printType() {
        System.out.println(this.type);
    }
}




public class oops {

    public static void main(String[] args) {
        //object
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        // pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";


        pen1.printColor();
        pen2.printColor();


    }
}