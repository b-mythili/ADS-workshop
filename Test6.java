import java.util.ArrayList;
interface PositionalList<E>{
    void insert(E element,int index);
    void remove(int index);
    void set(int index,E element);
    E  get(int index);
    boolean isEmpty();
    int size();
}
class ArrayListPositionalList<E> implements PositionalList<E>{
    private ArrayList<E> list;
 public ArrayListPositionalList(){
    list=new ArrayList<>();
    
 }
 @Override
 public void insert(E element,int index){
    list.add(index,element);
 }
 @Override
 public void remove(int index){
    list.remove(index);
 }
 @Override
 public void set(int index,E element){
    list.set(index,element);
 }
@Override
public E get(int index){
    return list.get(index);
}
@Override
public boolean isEmpty(){
    return list.isEmpty();
}
@Override
public int size(){
    return list.size();
}

}
public class Test6{
public static void main(String args[]){
    PositionalList<Object> list = new ArrayListPositionalList<>();
    list.insert("a",0);
    list.insert("b",1);
    list.insert(22,2);
    list.insert(222,3);
    list.remove(1);
    list.set(0,"d");
   Object element =list.get(1);
    boolean empty=list.isEmpty();
    int size=list.size();
    System.out.println("List After operations:");
    for (int i=0;i<list.size();i++){
        System.out.println(list.get(i));
    }
    System.out.println("element at index 0:"+element);
    System.out.println("is list empty?"+empty);
    System.out.println("size of list:"+size);



}
}
