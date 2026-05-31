import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {


    public static int lastStoneWeight(int[] stones) {

        //creating max heap
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> b - a);

        for(int stone: stones){
            heap.add(stone);
        }

        while(heap.size() > 1){

            int top1 = heap.poll();
            int top2 = heap.poll();

            int diff = top1 - top2;

            if(diff != 0)
                heap.add(diff);
        }

        if(heap.size() == 1)
            return heap.poll();
        else
            return 0;
    }

    public static void main(String[] args) {

        int[] stones = {4,4};

        System.out.println(lastStoneWeight(stones));
    }

}