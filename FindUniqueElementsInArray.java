package java_automation.Testing;

import java.util.HashMap;
import java.util.Map;

public class FindUniqueElementsInArray {

	public static void main(String[] args) {

		int[] input1 = { 1, 2, 3, 1, 4 ,2,1};

		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		
		
		//getOrDefault method checks if element exists in the map, if not present it
		//gets the count as 0.
		
      
	    for(int inp : input1)
	    {
	    	map1.put(inp,map1.getOrDefault(inp,0)+1);
	    }
	    
	    //In the above loop if a element is not present, it adds the element to map
	    //and then increase the count from 0 to 1


	    for(int result : input1)
	    {
	    	if(map1.get(result)==1)
	    	{
	    		System.out.print(" "+result);
	    	}
	    }

	}

}
