class A{
    public A(){
        super();
        System.out.println("In A");
    }
    public A(int A){
        System.out.println("In A int");
    }
}

class B extends A{
    public B(){
//        super(5);
        super();
        System.out.println("in B");
    }

    public B(int n){
//        super(n);
        this();
        System.out.println("in B int");
    }
}

public class ThisAndSuper {
   public static void main(String[] args) {
       B obj = new B();
    }
}