/** LC-88
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : Yes. I forgot to check the second while loop where we make sure ptr2 also goes out of bounds i.e all nums2
 * elements are covered in nums1
 *Algo:
 1. We keep ptr1 for nums1 and ptr2 for nums2...We keep them at m-1 and n-1
 2. Start i from end of the array with auxiliary space counted i.e. m+n
 Make sure both ptr1 and ptr2 go out of bounds.
 3. assign nums1[i] whichever value pointed by ptr1 and ptr2 is greater.
 */
package TwoPointers;

public class MergeSortedArrayInplace {
    public void merge(int[] nums1, int m, int[] nums2, int n) {


        if(m + n == 0 || nums1.length == 0 || nums2.length == 0) return;

        int ptr1 = m - 1;
        int ptr2 = n - 1;
        int i = m + n  - 1;
        while (ptr1 >= 0 && ptr2 >= 0){

            if(nums1[ptr1] >= nums2[ptr2]){
                nums1[i] = nums1[ptr1];
                ptr1--;
            }
            else{
                nums1[i] = nums2[ptr2];
                ptr2--;
            }
            i--;
        }
        while(ptr2 >= 0 ){   //if ptr is out of bounds but ptr still pointing inbounds
            nums1[i] = nums2[ptr2];
            ptr2--;
            i--;
        }

    }
}

//Testcase:
// 1= [1,2,3,0,0,0]
// 2= [-1,5,6]

