package programmes;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist_03 {

	public static void main(String[] args) {

ArrayList<String> ar=new ArrayList<>(Arrays.asList("peter,shyam,hellow,how,are,you"));
ArrayList<String> ar1=new ArrayList<>(Arrays.asList("peer,syam,hllow,ho,re,yu"));

//ArrayList<Integer> in=new ArrayList<>(Arrays.asList(10,20,30,40,50));
//ar.addAll(in);

ar.addAll(ar1);
System.out.println(ar);
	
	
	}

}
