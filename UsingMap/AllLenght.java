package UsingMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AllLenght {

	public static void main(String[] args) {

   List<String> number =new ArrayList<String>(Arrays.asList("peter","shyam","pratik","chhabikala","roshani"));
   
   List<String> lengthstring =new ArrayList<String>();
   
   //by using for loop
   
   for(String len: number) {
	   System.out.println(len.length());
   }
   
   System.out.println("By using stream");
   number.stream().map(num3 -> num3.length()).forEach(num3 -> System.out.println(num3));
     
	}

}
