// Time Complexity : O(M+N) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english:
/*initialize 3 pointers,  pointer(p1) pointing last non-zero element (m-1) in nums1; pointer (i) pointing to last element (m+n-1) in nums1 array; a pointer (p2) pointing to last element in nums2 array
* when the element at p1 is greater than element at p2, then assign element at p1 to index i and decrement p1 & i
* when the element at p2 is greater than element at p1, then assign element at p2 to i and decrement p2 & i
* finally a additional while loop for the cases like nums1 = [4,5,6,0,0,0] nums2=[1,2,3]
*/



public class MergeSortedArray{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
    	if(nums1==null || nums1.length==0) {
    		return;
    	}
    	
    	int p1=m-1,p2=n-1,i=m+n-1;
    	
    	while(p1>=0 && p2>=0) {
    		if(nums2[p2]<nums1[p1]) {
    			nums1[i] = nums1[p1];
    			p1--;
    		}else {
    			nums1[i] = nums2[p2];
    			p2--;
    		}
    		i--;
    	}
    	while(p2>=0) {                                             
    		nums1[i] = nums2[p2];
    		p2--;
    		i--;
    	}
    	
    }
	public static void main(String[] args) {
		MergeSortedArray ob = new MergeSortedArray();
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		ob.merge(nums1, 3, nums2, 3);
	}
}
