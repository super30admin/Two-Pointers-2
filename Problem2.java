
// Time Complexity : O(m+n)     // where m is the number of elements in nums1 and n is the number of elements in nums2, Worst case we will be traversing through  each element of nums1 and nums2 once.
// Space Complexity : O(1) // only constant space is used
// Did this code successfully run on Leetcode : Yes
// We will use 3 pointers for nums1, nums2 and one for keeping track of insert positions in nums1. We will start the traversal from the end and compare which one is greater will be placed at the end of the nums1.
// Your code here along with comments explaining your approach

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         if(n>0) {
        int i = m + n - 1;
        
        int j = n - 1;
        int k= m-1;
        
        while(i>=0 && j>=0 && k>=0){    // continue until all the indexes are greater than 0
            
            if(nums2[j] >= nums1[k]){      
                nums1[i--]= nums2[j--];
            }
            else
                nums1[i--]= nums1[k--];
        }
        // if nums2 is still left with elements, insert them in nums1. if nums1 is still left with elements and nums2 is over, it means                 nums1 cannot be compared with any more elements, and they will remain as they are in nums1
        while(j>=0){              
            nums1[i--]= nums2[j--];
        }
    }
    }
}
