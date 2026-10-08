abstract class Car{
    public abstract void drive();

    public void playMusic(){
        System.out.println("Music playing...");
    }
}

class Wagon extends Car{
    public void drive() {
        System.out.println("Driving Wagon...");
    }
}

public class Abstract {

    public static void main(String[] args){

        Car obj = new Wagon();
        obj.playMusic();
        obj.drive();
    }
}