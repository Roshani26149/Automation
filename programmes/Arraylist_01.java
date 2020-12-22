package programmes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Arraylist_01 {

	public static void main(String[] args) {
		ArrayList<Object> ar =new ArrayList<>();
		ar.add(100);
		ar.add("testing");
		ar.add('a');
		ar.add(400);
		ar.add(13.5);
		ar.add("java");
	    System.out.println(ar.size());
		System.out.println(ar);
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		for (Object p:ar) {
			System.out.println(p);
		}
		
	     ar.stream().forEach(a -> System.out.println(a));
	     
	     Iterator<Object> it=ar.iterator();
	      while(it.hasNext()) {
	    	  System.out.println(it.next());
	      }
		
    ArrayList <String> ap=new ArrayList<>(Arrays.asList("hellow" ," I"," Am", "Roshani","How","Are","you"));
    
    int i=ap.lastIndexOf("Roshani");
    System.out.println(i);
    
    
    ap.remove(3);
    System.out.println(ap);
    
    ap.remove(2);
    System.out.println(ap);
    
    ap.remove("hellow");
    System.out.println(ap);
    
	}

}
