package Java.Practice.Code;

@FunctionalInterface
interface Addable{
    int add(int a,int b);
}
public class FunctionalInterfaceExample implements Addable{

//    public static void main(String[] args) {
        Addable addable = ((a, b) -> {
            return a + b;
        });
//    }

    @Override
    public int add(int a, int b) {
        System.out.println(a+b);
        return a+b;
    }
}