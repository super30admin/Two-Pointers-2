
// Time Complexity : O(N) - N is size of the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
		int j=n-1;
		int k = m+n-1;
		while(k >= 0)
		{
            if(i == -1 && j >= 0){
                nums1[k--] = nums2[j--];
            }
            if(j  == -1 && i >= 0){
                nums1[k--] = nums1[i--];
            }
            else if(i >= 0 && j >= 0){
                if(nums1[i] > nums2[j])
				      nums1[k--] = nums1[i--];
			    else{
                nums1[k--] = nums2[j--];
                }		
            }
			
		}
    }
}
// Your code here along with comments explaining your approach
