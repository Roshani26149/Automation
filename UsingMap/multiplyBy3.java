package UsingMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class multiplyBy3 {

	public static void main(String[] args) {

 List<Integer> number =new ArrayList<Integer> (Arrays.asList(1,2,4,5,6,7));
 
 
 //By using for loop
 for(int multily : number) {
	 System.out.println(multily*3);
 }
 
 System.out.println("by using stream");
 //stream method
 number.stream().map(mul -> mul *3).forEach(num ->System.out.println(num));
 
 
 
 
	}

}
