import java.util.*;

public class CollectionsInJava {
    public static void main(String[] args) {
        Collection <Integer>nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(13);
        nums.add(8);
        nums.add(2);

        List <Integer> numbers = new ArrayList<Integer>();
        nums.add(27);
        nums.add(13);
        nums.add(22);
        nums.add(28);

//        Unordered values
        Set<Integer> num = new HashSet<>();
        nums.add(27);
        nums.add(13);
        nums.add(22);
        nums.add(28);

//        Use Treeset if you want ordered values

        Set<Integer> ints = new TreeSet<Integer>();
        nums.add(27);
        nums.add(13);
        nums.add(22);
        nums.add(28);


        for(int n : nums){
            System.out.println(n);
        }

//Instead of using for loop we can use iterator
        Iterator<Integer> values = nums.iterator();
        while(values.hasNext()){
            System.out.println(values.next());
        }

        System.out.println(nums);

    }



}
