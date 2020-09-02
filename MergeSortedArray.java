// TC: O(M+N) where M and N represents length of  2 given arrays.
// SC : O(1) since we are not using extra space

// We are checking from end of both arrays, If the value in one array is greater than another array, add greater value to end of first array
// if the value of first array is greater, add its value at the end. Keep adding till we reach start of any one of arrays.
// If there are any values remaining in second array, add those values to first array to the remaining first array.

public class MergeSortedArray {
	
	public int[] MergeArray(int[] nums1, int[] nums2, int n, int m) {
	
		int i = m-1, j = n-1;
		int k = m+n-1;
		
		while(i>=0 && j>=0) {
			
			if(nums1[i]<nums2[j]) {
				nums1[k--] = nums2[j--];
			}else {
				nums1[k--] = nums1[i--];
			}
		}
		while(j>=0)
			nums1[k--] = nums2[j--];
		
		
		
		for(int s=0;s<nums1.length;s++)
			System.out.print(nums1[s]+" ");
		return nums1;
	}
	public static void main(String[] args) {
		
		MergeSortedArray msa = new MergeSortedArray();
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		int m = 3;
		int n = 3;
		msa.MergeArray(nums1, nums2, n, m);
	}

}
