public class Sample1{
    public static void main(String args[]){//converting int to Integer
int a=20;
Integer i= Integer.valueOf(a);//converting int to  Integer explicitly
Integer j=a;//autoboxing,now compiler will write Integer.valueOf
int c=i.intValue();
System.out.println(a+" "+i+" "+j);
    }
}