import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

//Maps - Part of collections but is not a collection
//Map is a collection of key value pair
public class Maps {

    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<String , Integer>();

        students.put("Navin", 56);
        students.put("Brie", 26);
        students.remove("Navin");

        System.out.println(students);
        System.out.println(students.get("Navin"));
        students.put("Navin", 88);

        System.out.println(students.values());
        System.out.println(students.keySet());

        for (String key : students.keySet()){
            System.out.println(key  + " : " + students.get(key));
        }
    }
}
