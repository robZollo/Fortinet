package fortinet;

public class MultiDimensionArray {
	// This is a provided function, Assume it works
    public static Long getValue(int... indexOfDimension) {
        //...
    	printArray(indexOfDimension);
    	Long value = 3L;
        return value;
    }
    
    public static void printArray(int[] array)
    {
    	for (int i=0; i< array.length; i++)
    	{
    		System.out.print(array[i]+", ");
    	}
    	System.out.println("");
    }
    
    
    // lengthOfDeminsion: each dimension's length, assume it is valid: lengthOfDeminsion[i]>0.
    public static Long sum(int[] lengthOfDeminsion) { 
    	
    	int n = lengthOfDeminsion.length;
    	int[] tuple = new int[n]; // all zeroes
    	int at = n-2;
    	Long sum = 0L;
    	do
    	{
    	    for (tuple[n-1] = 0; tuple[n-1] < lengthOfDeminsion[n-1]; tuple[n-1]++)
    	    {
    	        sum += getValue(tuple);
    	    }
    	    //++t increments and then uses
    	    tuple[at]++;
    	    while (at >= 0 && tuple[at] == lengthOfDeminsion[at])
    	    {
    	        tuple[at] = 0;
    	        at = at-1;
    	        if (at >=0)
    	        	tuple[at]++;
    	    }
    	    if (at >= 0) at = n-2;
    	}
    	while (at >= 0);
    	
	   // Your resolution 
	   // Time complexity: O(k) where k = the sum of the  dimension length
	   // Space complexity: n where n = the number of dimensions.
	    return sum;
	    
    }
}
