import java.util.PriorityQueue;
import java.util.Collections;
public class  priorityqueueex2{
    public static void main(String args[]){
        PriorityQueue <Integer> pq=new PriorityQueue <Integer>(Collections.reverseOrder());
        pq.add(1);
        pq.add(12);
        pq.add(11);
        pq.add(16);
        pq.add(17);
        pq.poll();
        System.out.println(pq);
    }
}