class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Student() {
    //     System.out.println("Constructor called");
    // }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}


public class oops1 {

    public static void main(String[] args) {
        //object

        // Student s1 = new Student();
        // s1.name = "Aditi";
        // s1.age = 19;

        Student s1 = new Student("Aditi", 19);

        s1.printInfo();

    }
}
