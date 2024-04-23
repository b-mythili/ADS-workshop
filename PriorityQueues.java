import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Scanner;
public class PriorityQueues{
public static void main(String[] args){
PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
Scanner s=new Scanner(System.in);
   int m= s.nextInt();
for (int i=0;i<m;i++){
    pq.offer(s.nextInt());

        
  if(i<2)   {
    System.out.println(-1);
  }else{
    int first=pq.poll();
    int second=pq.poll();
    int third=pq.poll();
    int result=first*second*third;
    System.out.println(result);
    pq.offer(first);
    pq.offer(second);
    pq.offer(third);
  }
}
}   
}
