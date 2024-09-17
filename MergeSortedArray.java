//Approach: trick is to move big element from both arrray at the end of first array after increasing size of first array  by length of second array.
	//time comeplexiity:o(n)
	//space commplexity:o(1)
	//leetcode solution executed:yes
	//any problem faced:yes array index out of bound .need to write code to increase  length of array1.

public class MergeSortedArray {
	
	
	
	   public static void merge(int[] nums1, int m, int[] nums2, int n) {
	       while(n>0){
	    	   //check last element of both the array if element at array 1 bigger than first array then put bigger value in end of first array by increasing first array length 
	           if(m>0 && nums1[m-1]>nums2[n-1]){
	        	   //increase length of array1  
	               nums1[m+n-1] = nums1[m-1];
	               m--; //decrement pointer of second array
	           }else{
	        	   //element at second array is bigger than first then put bigger value at end of first array
	               nums1[m+n-1] = nums2[n-1];
	               n--; // decrement pointer of first array 
	           }
	       }
	   }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1= {1,2,3,0,0,0};			
		int[] num2= {2,5,6};
		merge(num1,num1.length-num2.length,num2,num2.length);
		for(int i=0;i<num1.length;i++)
		System.out.println("array is after merge="+num1[i]);

	}

}
