package NavinCollections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethod {

	public static void main(String[] args) {
		 ArrayList<String> ar1=new ArrayList<>(Arrays.asList("java","python","ruby","javascript"));
		 
		 ArrayList<String> ar2=new ArrayList<>(Arrays.asList("testing","Software"));
		 
		 ar1.addAll(ar2);
		 
		 System.out.println(ar1);
		// ar1.clear();
		 System.out.println(ar2);
		 
		 System.out.println("---------------");
		 ArrayList<String> clone=(ArrayList<String>)ar2.clone();
		 System.out.println(clone);
		 
		 //contains key
		 System.out.println(clone.contains("testing"));
		 System.out.println(clone.contains("java"));
		 
		 ArrayList<String> list1=new ArrayList<String>(Arrays.asList("Tom","Naveen","java","Lisa","Naveen","steave"));
		 int i=list1.lastIndexOf("Naveen");
		 System.out.println(i);
		 list1.remove(2);
		 System.out.println(list1);
		 
		 list1.remove("steave");
		 System.out.println(list1);
		 
		 
		 
		 
		 
		 
		 
	}

}
