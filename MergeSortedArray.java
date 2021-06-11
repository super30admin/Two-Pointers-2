/*TC - O(N)
 *SC-O(1)
 *Ran on leetcode - yes
 * */

// Approach - The idea is to start from the end of both the arrays and compare the corresponding elements to move the pointers. 

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m-1;
        int j = n-1;
        int index = nums1.length-1;
        while(i >=0 && j >= 0){
		// nums1 has enough space at the end, add the greater of the two numbers 
            if (nums1[i] > nums2[j]){
                nums1[index] = nums1[i];
                i -= 1;

            }   else{
                nums1[index] = nums2[j];
                j -= 1;

            }
            index -=1 ;
        }
	// copy the remainder elements if remaining already 
        while(i >=0){
            nums1[index] = nums1[i];
            i -=1;
            index -=1;

        }

        while(j >=0){
            nums1[index] = nums2[j];
            j -=1;
            index -=1;

        }



    }
}
