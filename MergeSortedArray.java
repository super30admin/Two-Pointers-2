// Time Complexity : O(m+n)
// Space Complexity : O(1)
//Approach:Using Two pointers
class MergeSortedArray {	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int p1= m-1;
		int p2=n-1;
		int idx=m+n-1;
		
		while(p1>=0 && p2>=0) {
			if(nums1[p1]>nums2[p2]) {
				nums1[idx]=nums1[p1];
				p1--;
			}else {
				nums1[idx]=nums2[p2];
				p2--;
			}
			idx--;
		}
		
		//If nums2 items are not finished, copy over to nums1
		while(p2>=0) {
			nums1[idx]=nums2[p2];
			p2--;
			idx--;
		}
       
        System.out.println("Arrays Merged!");
    }
	
	// Driver code to test above 
    public static void main(String args[]) { 
    	MergeSortedArray ob = new MergeSortedArray();
    	int[] nums1 = {1,2,3,0,0,0};
    	int m = 3; 
    	int[] nums2 = {2,5,6};
    	int n = 3;     	
        ob.merge(nums1,m,nums2,n);
    }  
}