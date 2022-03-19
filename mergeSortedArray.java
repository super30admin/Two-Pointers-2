// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/* APPROACH:
Using the 2 pointer approach (both arrays are sorted    ):
first pointer will point to the elements in array1, second pointer will point to the elements in array2
both the pointers will start from the last non-zero element in the respective arrays.
We will iterate through the first array starting from the last element using i
on comparing,
1. if(array1[pointer1] > array2[pointer2]) swap the elements array1[pointer1] and array1[i] pointer1--; i--;
2. if(array1[pointer1] <= array2[pointer2]) swap the elements array2[pointer2] and array1[i] pointer2--; i--;

Now if pointer1 reaches 0 ie the elements in the first array get exhausted, then we keep on adding the remaining elements from the second array into the first array.
We don't do this for first array in case second gets exhausted first as the elements in first array are already sorted.
*/

import java.util.Arrays;

public class mergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null) return;

        int p1 = m-1, p2 = n-1, idx = m+n-1;
        while(p1>=0 && p2 >=0){
            if(nums1[p1]>nums2[p2]){
                nums1[idx] = nums1[p1];
                idx--;
                p1--;
            } else {
                nums1[idx] = nums2[p2];
                idx--;
                p2--;
            }
        }
        while(p2 >= 0){
            nums1[idx] = nums2[p2];
            p2--;
            idx--;
        }
    }

    public static void main(String[] args){
        int[] nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6};
        int m = 3, n = 3; // {1,2,2,3,5,6}
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));

        int[] nums3 = {1}, nums4 = {};
        int m2 = 1, n2 = 0; // {1}
        merge(nums3, m2, nums4, n2);
        System.out.println(Arrays.toString(nums3));

        int[] nums5 = {0}, nums6 = {1};
        int m3 = 0, n3 = 1; // {1}
        merge(nums5, m3, nums6, n3);
        System.out.println(Arrays.toString(nums5));
    }
}
