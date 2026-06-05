import java.time.chrono.IsoEra;

public class Main {

    public static void moveZeroes(int[] nums) {

        int zeros = 0;

        for(int i = 0 ; i < nums.length; i++) {
            if(nums[i] == 0)
                zeros++;
        }

        int index = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }

        for(int i = 0; i < zeros; i++) {
            nums[index] = 0;
            index++;
        }

    }

    public static void main(String[] args) {


        moveZeroes(new int[]{0, 1, 0, 3, 12});
    }

}