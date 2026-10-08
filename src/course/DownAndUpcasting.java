class A{

    public void show1(){
        System.out.println("In A show");
    }
}

class B extends A{
    public void show2() {
        System.out.println("In B show");
    }
}

public class DownAndUpcasting {

    public static void main(String[] args){

        //We are going up - A Is A super class - This is upcasting - It happens implicitly behind the scenes
        A obj = (A) new B();
        obj.show1();

        // This is downcasting.
        B obj1 =(B) obj;
        obj1.show2();
    }
}