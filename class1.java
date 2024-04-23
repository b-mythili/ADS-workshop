import java.util.*;

public class class1{
    public static void main(String[]args){
        int r[]={2,3,4,6};
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        
        for(int i=0;i<r.length;i++){
            pq.add(r[i]);
            
        }
        int c=0;
        while(pq.size()>1){
            int min =pq.remove();
            int min2=pq.remove();
            c+=min+min2;
            pq.add(min+min2);
        }
        System.out.println("cost of connecting n ropes = "+c);
    }
}