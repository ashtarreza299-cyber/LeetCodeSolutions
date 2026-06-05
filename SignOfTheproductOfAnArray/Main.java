
public class Main {

    public static int arraySign(int[] nums) {

        int negative = 0;
        for(int n: nums){
            if(n == 0)
                return 0;
            else if(n < 0) {
                negative++;
            }
        }

        return (negative%2==0) ? 1 : -1;
    }

    public static void main(String[] args) {

        System.out.println(arraySign(new int[]{-1,1,-1,1,-1}));
    }

}