abstract class A{
//    public abstract void show(){
//        System.out.println("In A show");
//    }

    public abstract void show();
}


public class Inner {
    public static void main(String[] args) {
//        Inner Anonymous class and has no name;
        A obj = new A(){
            public void show(){
                System.out.println("In new show");
            }
        };

        obj.show();
    }
}