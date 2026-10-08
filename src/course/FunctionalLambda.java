
/*
Lambda expressions only work with functional interfaces
*/
@FunctionalInterface
interface A{
    void show();

}

@FunctionalInterface
interface B{
    void show(int i);

}

@FunctionalInterface
interface C{
    int add(int i, int j);

}

public class FunctionalLambda {

    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("In normal show");
            };
        };

        A obj2 = () ->{
            System.out.println("In Lambda show");
        };

        A obj3 = () -> System.out.println("In single statement lambda show");
        B obj4 = (int i) -> System.out.println("In param lambda show " + i);

        C obj5 = new C(){
            public int add(int i, int j){
                return i+j;
            }
        };

        C obj6 = (i,j) -> i+j;

        obj2.show();
        obj3.show();
        obj4.show(5);
        int result =obj5.add(2,6);
        int total =obj6.add(2,7);
        System.out.println(result);
        System.out.println(total);

        }


}