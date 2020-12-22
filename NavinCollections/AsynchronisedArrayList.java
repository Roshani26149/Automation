package NavinCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class AsynchronisedArrayList {

	public static void main(String[] args) {
	
		List<String> nameslist=Collections.synchronizedList(new ArrayList<String>());
		nameslist.add("java");
		nameslist.add("python");
		nameslist.add("ruby");
		
		for(String names:nameslist) {
			System.out.println(names);
		}
		
		
		CopyOnWriteArrayList<String> emplist= new CopyOnWriteArrayList<String>();
		emplist.add("Tom");
		emplist.add("Steve");
		emplist.add("Naveen");
		
		System.out.println("--------------");
		Iterator<String> it =emplist.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
