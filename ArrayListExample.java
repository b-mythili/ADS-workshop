import java.util.ArrayList;
public class ArrayListExample{
    public static void main(String args[]){
        ArrayList<Object> l1=new ArrayList<>();
        l1.add("apple");
        l1.add("mango");
        l1.add(66.9990);
        l1.add("sapota");
        l1.add(22.99);
        System.out.println("Element at index 0:"+l1.get(0));
        System.out.println("Element at index 1:"+l1.get(1));
        System.out.println("Element at index 2:"+l1.get(2));
        System.out.println("Element at index 3:"+l1.get(3));
        System.out.println("size of arraylist is:"+l1.size());

         System.out.println("arraylist elements:");
         for(Object fruit:l1){
            System.out.println(fruit);
         }
        l1.remove(1);
        l1.remove(2);
        System.out.println("after removing elements the arraylist is:");
            System.out.print(l1);
       l1.add(2,"grapes");
       System.out.println("\nafter adding elements"+l1);
       l1.set(3,"plum");
       System.out.println("after setting an element"+l1);
l1.add(99);
l1.add('d');
System.out.print("new arraylist:");
System.out.print(l1);
    }
}