
	//Time complexity O(n)
	//space complexity o(1)
	//approach: iterate though whole array and check any number is repeating thrice or not .if yes then replace  number which is repeated more than twice with next element then aafter checking tilllast element in an array return length index+1;
	//any difficulty faced:mo
	//leetcode solved:yes
	
public class RemoveDuplicatesFromSortedArray {
	
	
	   public static int removeDuplicates(int[] nums) {
	         int i =1; int j=2;
	         
	         //iterate through array starting from index 1 and j=2
	         
	         while(j<nums.length){
	        	 //this if condition checked evey element should have max two duplicates only .
	        	 //if three duplicates then replace extra duplicate with next element 
	        	// compare second element at i with next element at j and next element at j with first element at i-1 equal then j++
	        	//compare again jth element if not equal then incresease i and replace j th element with ith so that duplicate value will get replace by next unique value.
	             if(nums[i] == nums[j] && nums[j] == nums[i-1]){
	                 j++;
	                 
	             }else{
	                 i++;
	                 nums[i] =nums[j];
	                 j++;
	             }
	         }
	         return i+1;
	   }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,1,2,2,3};
		int length = removeDuplicates(nums);
        System.out.println("length after removing duplicates which are repeating more than twice="+length);
	}

}
