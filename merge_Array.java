
/*
Time Complextiy:  O (m +n) where m and n is the size which has given in the function.
Space O(1) // as we are not using any auxillary space.
// Did this code successfully run on Leetcode : Yes.
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

As nums1 have size of m + n using this property adding elements from the end. and last checking
 if m and n is not 0 then adding the elements which are left.

*/

public class merge_Array {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = nums1.length - 1;
        // as array has 0 based indexing decrementing it for array out of bound
        // exception.
        m--;
        n--;

        while (m >= 0 && n >= 0) {

            if (nums1[m] > nums2[n]) {

                nums1[i--] = nums1[m];
                m--;

            } else {

                nums1[i--] = nums2[n];
                n--;

            }

        }
        // checking if element is left.
        while (m >= 0) {

            nums1[i--] = nums1[m];
            m--;

        }
        while (n >= 0) {

            nums1[i--] = nums2[n];
            n--;
        }

    }
}
