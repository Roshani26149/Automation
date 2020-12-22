package NavinCollections;

import java.util.ArrayList;
import java.util.Arrays;

public class arraysAndArrayList {

	public static void main(String[] args) {
		ArrayList<Object> ar=new ArrayList<>();
		ar.add("Maths");
		ar.add("Science");
		ar.add(12);
		ar.add("History");
		ar.add("Economics");
		System.out.println(ar.get(2));
		
		//for each group
		for(Object array:ar) {
			System.out.println(array);
		}
		
		System.out.println("--------------------");
		//Lambda expression
		ar.stream().forEach(arraylsit ->System.out.println(arraylsit));
		
		System.out.println("---------------");
		ArrayList<String> listing =new ArrayList<>(Arrays.asList("Cricket","polo","hocky","badbintal"));
		System.out.println(listing.get(2));
		
		listing.stream().forEach(lsitingArrays-> System.out.println(lsitingArrays));

	}

}
