

public class Main {

    public static int[] shuffle(int[] nums, int n) {

        int[] ans = new int[2*n];

        int low = 0;
        int high = n;
        int index = 0;
        while(low <= n && high < 2*n) {

            if(index%2 == 0) {
                ans[index] = nums[low];
                low++;
            }
            else {
                ans[index] = nums[high];
                high++;
            }
            index++;
        }

        return ans;

    }


    public static void main(String[] args) {

        int[] nums = {1,2,3,4,4,3,2,1};

        shuffle(nums, 4);

    }

}