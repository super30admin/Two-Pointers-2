//time complexity-o(n)
//space complexity-o(1)
public class RemoveDuplicates {
	public int removeDuplicates(int[] nums) {
	    int i = 0;
	    int k=0;
	    for (int n : nums)
	        if (i<2  || n > nums[i-2]  )
	            nums[i++] = n;
	   
	    	
	    
	    return i;
	}

public static void main(String args[])
{
	RemoveDuplicates d=new RemoveDuplicates();
	int nums[]= {1,1,1,2,2,3,3,3};
	System.out.print("length"+d.removeDuplicates(nums));
}
}
