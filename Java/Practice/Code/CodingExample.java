package Java.Practice.Code;


/*
[1,2,3,4,5,10]
*/

import java.security.spec.ECField;

public class CodingExample {
    public int[] multiplesOf2(int[] nums){
        int[] multipleArray = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            multipleArray[i] = nums[i]*2;
        }
        return multipleArray;
    }

    public String reverseString(String value){
        String reverseString="";
        for(int i=0;i<value.length();i++){
            reverseString+=value.charAt(value.length()-1-i);
        }
        return  reverseString;
    }



    public String validateVoteEligibility(int age){
        if(age>=18){
            return "Eligible to Vote";
        }else{
            try{
                throw new Exception();
            }catch (Exception e){
                return "Not Eligible to Vote";
            }
        }
    }


    public static void main(String[] args) {
        CodingExample codingExample = new CodingExample();
        /*int[] input = new int[10];
        for(int i=0;i<10;i++){
            input[i]=i+1;
        }

        int[] response = codingExample.multiplesOf2(input);
        for(int i=0;i<response.length;i++){
            System.out.print(response[i]+" ");
        }*/

        /*System.out.println(codingExample.reverseString("SRAVAN"));*/

        System.out.println(codingExample.validateVoteEligibility(12));



    }
}
