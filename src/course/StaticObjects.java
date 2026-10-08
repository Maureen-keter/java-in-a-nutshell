public class StaticObjects {
    public static void main(String[] args){
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
//        obj1.name = "Smartphone";
//        static variables aere called by the class name
        Mobile.name = "Smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        obj2.name = "Smartphone";

        Mobile.name = "Smartphone";

//        changing a static variables value affect all the objects calling it
        obj1.name = "Gadget";

        obj1.show();
        obj2.show();

    }
}

class Mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}