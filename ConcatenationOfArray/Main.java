
public class Main {

    public static int[] getConcatenation(int[] nums) {

        int[] ans = new int[nums.length * 2];

        for(int i = 0 ; i < ans.length; i++) {
            ans[i] = nums[i % nums.length];
        }

        return ans;
    }

    public static void main(String[] args) {
        
        int[] nums = {1, 2, 1};

        getConcatenation(nums);
    }

}