package CollectionFramework.PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorCollection {

    public static void main(String[] args) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>(Collections.reverseOrder());
        minheap.add(5);
        minheap.add(3);
        minheap.add(15);

        System.out.println(minheap);

        System.out.println("Polling : " + minheap.poll());

        System.out.println(minheap);
    }
}
