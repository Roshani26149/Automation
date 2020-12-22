package programmes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arraylist_04 {

	public static void main(String[] args) {

		 ArrayList <Integer> number =new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
          
		 
		 number.removeIf(num -> num%2==0);
		 System.out.println(number);
		 
		 ArrayList<String> str = new ArrayList<>(Arrays.asList("java","python","ruby","c#","navin","Snehal","tina"));
		 
		 str.retainAll(Collections.singleton("java"));
		 System.out.println(str);
			 
		 
//		 ArrayList <String> art=new ArrayList<>(str.subList(1, 2));
//		 System.out.println(art);
		 
		 
		 ArrayList<String> newlist=newlist=new ArrayList<String> (Arrays.asList("naveen","Tom","peter","steve","lisa","robort"));
		
		 Object arr[] =newlist.toArray();
		 System.out.println(Arrays.toString(arr));
		 
		 for(Object o:arr) {
			 System.out.println(o);
		 }
		
		 
		 
		
		
		

	}

}
