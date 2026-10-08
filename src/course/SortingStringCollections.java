
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
    int age;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "age=" + age + ", name='" + name + '\'' + '}';
    }

    String name;

}


public class SortingStringCollections {
    public static void main(String[] args) {
        Comparator<Student> comp = new Comparator<Student>() {
            public int compare(Student i, Student j) {
                if (i.age > j.age)
                    return  1;
                else
                    return -1;
            }
        };

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(1, "Navin"));
        studs.add(new Student(18, "Kenny"));
        studs.add(new Student(27, "GK"));

//        System.out.println(studs);
        for (Student s : studs){
            System.out.println(s);
        }

    }
}
