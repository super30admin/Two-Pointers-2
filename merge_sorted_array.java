/*

Did it run on leetocde: Yes
Time Complexity: 0(m+n)
Space Complexity: 0(1)

Challenges: Start from first or last and one of m or n becomes zero (merge sort condition)
Algorithm:
- We start from last element of nums1.
- We compare a=nums1[m] and b=nums2[n].
- if b is greater then we just copy it in nums1 and decrease size and n.
- if a is greater then we excahnge emplty place that is zero with a. and decrease m,size
      
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int size = m + n - 1;
        m = m - 1;
        n = n - 1;
        while (m >= 0 && n >= 0) {
            if (nums1[m] < nums2[n]) {
                nums1[size] = nums2[n];
                n--;
                size--;
            } else {
                nums1[size] = nums1[m];
                nums1[m] = 0;
                m--;
                size--;
            }
        }

        while (m >= 0) {
            nums1[size] = nums1[m];
            m--;
            size--;
        }

        while (n >= 0) {
            nums1[size] = nums2[n];
            n--;
            size--;
        }

    }
}