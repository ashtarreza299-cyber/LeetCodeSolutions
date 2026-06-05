import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Main {

    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b)->a[0]+a[1]-b[0]-b[1]);

        List<List<Integer>> result = new ArrayList<>();

        // Add the first pair from each row
        for (int i = 0; i < Math.min(k, nums1.length); i++) {
            heap.offer(new int[]{i, 0});
        }

        while(k > 0 && !heap.isEmpty()) {

            int[] sm = heap.poll();

            int i = sm[0];
            int j = sm[1];

            List<Integer> list = new ArrayList<>();
            list.add(i);
            list.add(j);
            result.add(list);

            heap.offer(new int[]{nums1[0], nums2[i], 0});

            // Push the next pair from the same row
            if (j + 1 < nums2.length) {
                heap.offer(new int[]{i, j + 1});
            }

            k--;
        }


        for(List list: result){
            System.out.println(list);
        }
        return result;
    }

    public static void main(String[] args) {


        int nums1[] = {1,7,11};
        int nums2[] = {2,4,6};

        kSmallestPairs(nums1, nums2, 3);

    }

}