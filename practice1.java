class Chatro {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    //constructor
    Chatro(String name, int age) {
        this.name = name;
        this.age = age;
    }
}



public class practice1 {
    public static void main(String[] args) {
        // object

        // Chatro c1 = new Chatro();

        // c1.name = "Aditi";
        // c1.age = 19;

        Chatro c1 = new Chatro("Aditi", 19);
        Chatro c2 = new Chatro("Atanu", 20);

        c1.printInfo();
        c2.printInfo();
    }

}
