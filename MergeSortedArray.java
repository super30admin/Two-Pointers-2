/*Time Complexity: O(m+n)
Space Complexity: O(1)
Did it run on Leetcode: Yes
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         if(n>0) {
        int i = m + n - 1;

        int j = n - 1;
        int k= m-1;

        while(i>=0 && j>=0 && k>=0){    // continue reducing until any index reach 0

            if(nums2[j] >= nums1[k]){      
                nums1[i--]= nums2[j--];
            }
            else
                nums1[i--]= nums1[k--];
        }
        // if nums2 is still left with elements, insert them in nums1. 
		//if nums1 is still left with elements ,then nums1 cannot be compared with any more elements, and they will remain in nums1
        while(j>=0){              
            nums1[i--]= nums2[j--];
        }
    }
    }
}