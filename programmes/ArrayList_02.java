package programmes;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_02 {
	public static void main (String[] args) {

		ArrayList <String>ar = new ArrayList<>();

		ar.add("hellow");
		ar.add("Tom");
		ar.add("peter");
		ar.add("java");
		ar.add("selenium");
		ar.add("python");
		ar.add("ruby");
		
		
		System.out.println("with for loop");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
       
		System.out.println("with for each loop");
		
		for(String s:ar)
		{
			System.out.println(s);
		}

         System.out.println("with lamda expression");
         
         ar.stream().forEach(s -> System.out.println(s));
         
         System.out.println("with Iterator");
         
          Iterator <String> it=ar.iterator();
          while(it.hasNext()) {
        	  System.out.println(it.next());
          }

	}	


}
