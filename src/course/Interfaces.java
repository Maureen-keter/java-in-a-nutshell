/*
class -- class -> extends
class -- interface -> implements
interface -- interface -> extends
 */

interface A{
//    public abstract  void show();
//    public abstract  void config();
    void show();
    void config();

    int age = 50;
    String state = "Ohio";
}

class B implements A{
    public void show(){
        System.out.println("In show");
    }

    public void config() {
        System.out.println("In config");
    }
}

public class Interfaces {

    public static void main(String[] args) {
        A obj;
        obj = new B();

        obj.show();
        obj.config();
        System.out.println(A.age);
        System.out.println(A.state);
    }
}