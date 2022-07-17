//88. Merge Sorted Array
//Time Complexity :size of first array is m and size of second array is n. So, O(mn)
//Space Complexity : O(1) i.e. as no extra space is required to store array elements while processing 
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

//Your code here along with comments explaining your approach

/*Step 1: check whether n ums1 is not null if so then return nothing. Assign 3 pointers, p1-to m-1th element of nums1.p2 to n-1th element of nums2 and p3 to m+n-1element of nums1.
 * Step 2: We will check p1 and p2 values and whichever will be greater we will assign it to the p3 pointer position. And which ever was largest among them will be
 *decremented along with p3 pointer.
 *Step 3: Treat condition of remaining numbers in nums2 with separate while loop where you are assigning p2 value to p3 and decrementing both 
 */
//output: 1 2 2 3 5 

public class mergeSortArray {

	public static void main(String[] args) {
		int[] nums1= {1,2,3,0,0,0};
		int[] nums2= {2,5,6};
		int m=3;
		int n=3;
        if(nums1 == null || nums1.length == 0) return;
        
        int p1=m-1;
        int p2=n-1;
        int p3=(m+n)-1;

        while(p1>=0 && p2>=0){
            if(nums1[p1] < nums2[p2])
            {
                nums1[p3]=nums2[p2];
                p2--;
                p3--;
            }
            else{
                nums1[p3]=nums1[p1];
                p1--;
                p3--;
            }
        }
        while(p2>=0){ //if there are no elements in nums1 but there are elements in nums2
            nums1[p3]=nums2[p2];
                p2--;
                p3--;
        }
        for(int i=0; i<(m+n)-1; i++)
        {
        	System.out.print(nums1[i]+" ");
        }
	}
}
