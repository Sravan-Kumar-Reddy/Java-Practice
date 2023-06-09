package Java.Practice.DriverClass;

import Java.Practice.Code.*;
import jdk.nashorn.internal.ir.FunctionCall;



@FunctionalInterface
interface Addable{
    int add(int a,int b);
}
public class DriverClass {
    public static void main(String[] args) {
        FunctionalInterfaceExample functionalInterfaceExample = new FunctionalInterfaceExample();
        functionalInterfaceExample.add(4,5);
        Addable addable = (a,b)->{
            return (a+b);
        };
        System.out.println(addable.add(9,9));

    }


}
