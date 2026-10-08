import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingCollections {
    public static void main(String[] args) {

        Comparator<Integer> comp = new Comparator<Integer>(){
            public int compare(Integer i, Integer j){
                if (i%10 > j%10) return i;
                else
                    return -1;
            }
        };


        List<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(7);
        nums.add(9);
        nums.add(13);

//        Collections.sort(nums);

        System.out.println(nums);
    }
}
