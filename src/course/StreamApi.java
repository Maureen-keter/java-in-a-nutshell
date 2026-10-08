import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {

        //        You can use stream only once
//        s1.forEach(n -> System.out.println(n));
//        s1.forEach(n -> System.out.println(n));
        List<Integer> nums = Arrays.asList(4,6,2,3);
//        nums.forEach(n -> System.out.println(n));
        Stream<Integer> s1 = nums.stream();

        Stream<Integer> s2 =s1.filter(n  -> n%2 ==0);
        Stream<Integer> s3 =s2.map(n  -> n*2);
        int result = s3.reduce(0, (c,e) -> c+e);

//        s2.forEach(n -> System.out.println(n));
//        s3.forEach(n -> System.out.println(n));
//        System.out.println(result);

        int value = nums.stream().filter(num-> num%2==1)
                .map(num ->num*2)
                .reduce(0, (c,e) -> c+e);
        System.out.println(value);


    }
}
