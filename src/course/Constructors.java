class Human{
    private String name;
    private int age;

//    Default constructor
    public Human(){
       age = 12;
       name = "Navin";
    }

//    parameterized constructor
    public Human (int age, String name){
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


public class Constructors{
    public static void main(String[] args){
        Human human = new Human();
        Human child = new Human(18, "Chris");

        System.out.println(human.getName() + ":" + human.getAge());
        System.out.println(child.getName() + ":" + child.getAge());
    }
}