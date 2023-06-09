package Java.Practice.Code;

@FunctionalInterface
interface Addable{
//    int add(int a,int b);

    void add(int a, int b);
}
public class FunctionalInterfaceExample implements Addable{

    static void sum(int a,int b){
        System.out.println(a+b);
    }

    @Override
    public void add(int a, int b) {
        System.out.println(a+b);
//        return a+b;
    }
}