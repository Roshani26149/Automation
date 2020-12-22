package UsingMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConverAllInUpperCase {

	public static void main(String[] args) {
    
		
		List <String> Vehicles =new ArrayList<String>(Arrays.asList("bus","car","bicycle","cycle","truck"));
		
		List<String>VehicleInUpperCase=new ArrayList<String>();//empty arraylist to store all value
		
		//Approach 1 using for loop
		
		for(String uppercase:Vehicles) {
			VehicleInUpperCase.add(uppercase.toUpperCase());
		}
		
		//Approch 2:By using stream map
		
		VehicleInUpperCase=Vehicles.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
		System.out.println(VehicleInUpperCase);
		
		
		
		System.out.println(VehicleInUpperCase);
		}
	

	
	
	
}
