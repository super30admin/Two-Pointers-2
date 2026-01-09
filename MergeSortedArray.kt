// In this problem, we have kept two pointers, one for each array pointing to the end of the valid elements. We have another pointer pointing to the end of the merged array which is collecting the number we want to write. 
// We compare the elements at pointers P1 and P2, and write the larger one at the positin pointed by col. We then make sure the second array is also completely copied over to the merged array.
//Time Complexity: O(m + n)
//Space Complexity: O(1) 

class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var P1 = m - 1
        var P2 = n - 1
        var col = nums1.size - 1

        while (P1 >= 0 && P2 >= 0) {
            if(nums1[P1] > nums2[P2]) {
                nums1[col] = nums1[P1]
                P1--
            } else {
                nums1[col] = nums2[P2]
                P2--
            }
            col --
        }

        while(P2 >= 0) {
            nums1[col] = nums2[P2]
            P2--
            col--
        }

     }
}