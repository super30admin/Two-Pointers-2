
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

public class MergeSortedArray {
    // time complexity: O(m+n)
    // space complexity: O(1)

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1; // last position of array
        int p2 = n-1; // last position of array
        int index = m+n-1; // at last index

        while(p1 >= 0 && p2 >= 0){
            // compare if element @ p1 or p2 is greated, whichever is greater move it to index
            if(nums1[p1] > nums2[p2]){
                nums1[index] = nums1[p1];
                p1--;
            } else {
                // if element @ p2 is greater
                nums1[index] = nums2[p2];
                p2--;
            }
            index--;
        }

        // now just need to fill elements which ever is left
        // elements are left in nums2 array
        while(p2 >= 0){
            nums1[index] = nums2[p2];
            p2--;
            index--;
        }


        // say if nums are left in nums1 array, then let it be as it is the answer array
    }

}

