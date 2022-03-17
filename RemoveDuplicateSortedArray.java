// Time Complexity : O(n)
// Space Complexity : O(1)
//Approach:Using Two pointers
class RemoveDuplicateSortedArray {	
	public int removeDuplicates(int[] nums) {
		if(nums==null || nums.length==0) return 0;
		int count=1;
		int slow=1;//slow pointer
		
		for(int i=1; i<nums.length; i++) {
			if(nums[i]==nums[i-1]) {
				count++;
			}else {
				count=1;
			}
			
			//replacing elements in place to remove more than 2 duplicates
			if(count<=2) {
				nums[slow]=nums[i];
				slow++;
			}			
		}
		
		return slow;
	}
	
	// Driver code to test above 
    public static void main(String args[]) { 
    	RemoveDuplicateSortedArray ob = new RemoveDuplicateSortedArray();
    	int[] nums = {1,1,1,2,2,3};
        System.out.println("Number of elements after rmeoving duplicates:" + ob.removeDuplicates(nums));
    }  
}