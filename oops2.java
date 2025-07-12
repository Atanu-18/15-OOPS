class Manus {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Student() {
    //     System.out.println("Constructor called");
    // }

    Manus(Manus m2) {
        this.name = m2.name;
        this.age = m2.age;
    }

    Manus(){
        
    }
}


public class oops2 {

    public static void main(String[] args) {
        //object

        Manus m1 = new Manus();
        m1.name = "Atanu";
        m1.age = 20;

        Manus m2 = new Manus(m1);
        m2.printInfo();

        

    }
}
