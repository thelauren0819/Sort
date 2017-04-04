/**
The sort method of this class sorts an array, using the selection 
sort algorithm.
 */
public class SelectionSorter
{
    /**
    Sorts an array, using selection sort.
    @param a the array to sort
     */
    public static void sort(int[] a)
    {  
        // to do.  add you selection sort here
    	for(int i = 0; i < a.length - 1; i++)
    	{
    		int minPos = smallestIndex(a , i);
    		ArrayUtil.swap(a, minPos, i);
    	}

    }
    
    public static int smallestIndex(int[]a , int start)
    {
    	int smallestIndex = start;
    	for(int i = start + 1; i < a.length; i++)
    	{
    		if(a[i] < a[smallestIndex])
    		{
    			smallestIndex = i;
    		}
    	}
    	return smallestIndex;
    }
}

