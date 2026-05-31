import java.util.HashSet;
import java.util.Set;

public class Main {

    public static int[] findErrorNums(int[] nums) {


        Set<Integer> seen = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        int[] mismatch = new int[2];

        for(int num: nums) {

            set.add(num);

            if(!seen.contains(num)) {
                seen.add(num);
            }
            else
                mismatch[0] = num;
        }

        for(int i = 1; i <= nums.length; i++) {
            if(!set.contains(i)) {
                mismatch[1] = i;
            }
        }

        return mismatch;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,2,4};

        findErrorNums(nums);
    }

}