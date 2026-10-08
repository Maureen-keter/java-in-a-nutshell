
class Laptop{
    int price;
    String brand;
    String model;

    public String toString(){
        return "Hey";
    }

    public boolean equals(Laptop that){
        if (this.model.equals(that.model) && this.price == that.price)
            return true;
        else
            return false;
    }
}

public class ObjectClass {

    public static void main(String[] args){

        Laptop obj = new Laptop();
        obj.model = "HP";
        obj.price = 1000;

        Laptop obj1 = new Laptop();
        obj1.model = "HP";
        obj1.price = 1000;

        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo";
        obj2.price = 1000;

        boolean result = obj1 == obj2;
        boolean result1 = obj1.equals(obj2);


        System.out.println(result1);
    }
}