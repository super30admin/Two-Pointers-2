//Time Complexity : O(m+n) where m and n are length of nums1 and nums2 respectively
//Sapce Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english:
// We will take three pointers - p1 ,p2 at max value of nums1 and nums2 respectively and idx ptr at last index of nums1 i.e.(m+n-1). We will compare the value at p1 and p2 .The one which is greater will be placed at idx and pointer will be decreemented . At the end if there are values left in nums2 ,then we will place all the values of nums2 in nums1 . 

//CODE:

public class merge_sorted_array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null)
            return;

        int p1 = m - 1; // starting from the max value of both the arrays
        int p2 = n - 1;
        int idx = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) { // if value at p1 is greater than value at p2 then we will put p1 value at idx
                                         // ;else we will put p2 value at idx and we will decreement the ptr whose value
                                         // we are placing at idx
                nums1[idx] = nums1[p1];
                p1--;
            } else {
                nums1[idx] = nums2[p2];
                p2--;
            }
            idx--;
        }
        while (p2 >= 0) { // if the values are left in nums2 array ,so we will place all the left values
                          // of nums2 in nums1 one by one
            nums1[idx] = nums2[p2];
            p2--;
            idx--;
        }

    }
}
