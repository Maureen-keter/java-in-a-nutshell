public class ForEachLoop{
    public static void main(String[] args){
        int nums[] = new int[4];
        nums[0] = 4;
        nums[1] = 7;
        nums[2] = 8;
        nums[3] = 3;

//        for(int i=0; i<nums.length; i++){
//            System.out.println(nums[i]);
//        }

//        This is the for each/ enhanced for loop
        for(int n : nums){
            System.out.println(n);
        }
    }
}