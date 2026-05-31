import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int[] smallerNumbersThanCurrent(int[] nums) {


        System.out.println(builder.toString());
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {

            int count = 0;
            for(int j = 0; j < nums.length; j++) {
                if(nums[j] < nums[i]) {
                    count++;
                }
            }
            list.add(count);
        }

        int[] result = new int[nums.length];
        for(int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;

    }

    public static void main(String[] args) {

        int[] nums = {4, 2, 4, 8};
        smallerNumbersThanCurrent(nums);

    }

}