import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
public class Queue2{
    public static void main(String [] args){
        Queue<Integer> q=new LinkedList<>();
        q.offer(10);
         q.offer(20);
          q.offer(30);
           q.offer(40);
            q.offer(50);
            System.out.print("initial queue is:"+q);
            Stack<Integer> s=new Stack<Integer>();
            while(q.size()>0){
                s.push(q.poll());
            }
            while(s.size()>0){
                q.offer(s.pop());
            }
            System.out.println("\nafter reversing queuue using stack,the new queue is:"+q);
    }
}