package Java.Practice.Code;

import java.util.Arrays;
import java.util.List;

public class Streams {

    public static void main(String[] args) {
        /*String[] arr = {"Geeks", "for", "Geeks"};
        Stream<String> stream = Arrays.stream(arr);
        // Displaying elements in Stream
        stream.forEach(str -> System.out.print(str + " "));

        // Creating an Stream
        Stream stream2 = Stream.of("Geeks", "for", "Geeks");

        // Displaying the sequential ordered stream
        stream2.forEach(str -> System.out.print(str + " "));
        // Creating an integer array
        Integer arr2[] = {1, 2, 3, 4, 5};
        String arr3[] = {"1", "2", "3", "4", "5"};

        // --------- Using Arrays.stream() ---------
        // to convert int array into Stream
//        IntStream intStream = Arrays.stream(arr2);
        Stream integerStream = Arrays.stream(arr3);
        Stream<Integer> stringStream = Arrays.stream(arr2);*/

        List<Integer> nums = Arrays.asList(1,2,3,4,4,5,6,7,8,9);

        System.out.println(nums.stream()
                .filter(n->n%2==1)
                .reduce(0,(a,b)->a+b)
                .compareTo(25));


    }
}
