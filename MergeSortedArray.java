// Time Complexity : O(n) where  n = size of the array
// Space Complexity : O(1) not extra auxiliary space used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*Approach
 * We will be using approcah where we maintain the position of the elements from each array from the end.
 * We compare from the end ie m-1th element and n-1th element and put the largest element in the end of the
 * 1st array. This helps to merge both arrays in single pass while maintaining the array in sorting order
 * */


public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //edge
        if(nums1==null) return;
        int p1=m-1, p2=n-1;
        int i=m+n-1;
        //start from the end and put the largest element in the end
        while(p1>=0 && p2>=0){
            //compare the value of the element in both array put the larger element in the
            // end of the nums1 array
            if(nums1[p1]>nums2[p2]){
                nums1[i] = nums1[p1];
                p1--;
                i--;
            }
            else {
                nums1[i]=nums2[p2];
                p2--;
                i--;
            }
        }

        //if there are any elements remaining in the 2nd array
        //since 1st array went out of bounds, we move the remaining elements
        while (p2>=0){
            nums1[i] = nums2[p2];
            i--; p2--;
        }
    }
}