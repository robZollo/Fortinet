package fortinet;

import java.util.List;

public class EqualSums {
	
	public static boolean separate(List<Integer> list, int k)
	{
		if (k == 1)
			return true;
		if (list.size() < k)
			return false;
		int sum = 0;
		int listSize = list.size();
		for (int i=0;  i< listSize; i++)
		{
			sum += list.get(i);
		}
		if (sum%k != 0)
			return false;
		
		int subsetTotal = sum /k;
		int[] subsetSums = new int[k];
		boolean[] taken = new boolean[listSize]; 
		for (int i=0; i<listSize; i++)
		{
			taken[i] = false;
		}
	    subsetSums[0] = list.get(listSize- 1);
	    taken[listSize - 1] = true;
	 
	    return isKPartitionPossibleRec(list, subsetSums, taken,
	    		subsetTotal, k, listSize, 0, listSize - 1);
		
	   // Your resolution 
	   // Time complexity:   nlog(n)
	   // Space complexity: O log(n)
	}

	private static boolean isKPartitionPossibleRec(List<Integer> list,
			int[] subsetSums, boolean[] taken, int subsetTotal, int k,
			int listSize, int currentIndex, int limitIndex) 
	{
		if (subsetSums[currentIndex] == subsetTotal)
	    {
			if (currentIndex == k-2)
				return true;
			
			return isKPartitionPossibleRec(list, subsetSums, taken, subsetTotal,
                    k, listSize, currentIndex + 1, listSize - 1);
	    }
		
		for (int i = limitIndex; i >= 0; i--)
	    {
	        if (taken[i])
	            continue;
	        int tmp = subsetSums[currentIndex] + list.get(i);
	 
	        if (tmp <= subsetTotal)
	        {
	            taken[i] = true;
	            subsetSums[currentIndex] += list.get(i);
	            boolean nxt = isKPartitionPossibleRec(list, subsetSums, taken,
	            		subsetTotal, k, listSize, currentIndex, i - 1);
	 
	            taken[i] = false;
	            subsetSums[currentIndex] -= list.get(i);
	            if (nxt)
	                return true;
	        }
	    }
		return false;
	}

}
