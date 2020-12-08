/*
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if nums1 is None or len(nums1) == 0:
            return
        p1 = m - 1 
        p2 = n - 1
        i = m + n - 1
        
        while p1 > - 1 and p2 > -1:
            if nums1[p1] > nums2[p2]:
                nums1[i] = nums1[p1]
                p1 -= 1
            else:
                nums1[i] = nums2[p2]
                p2 -= 1
                
            i -= 1
        
        while p2 >= 0:
            nums1[i] = nums2[p2]
            p2 -= 1
            i -= 1
*/

// Time Complexity : O(m+n) where m,n is array size of both
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Your code here along with comments explaining your approach: I took 3 pointers and leveraged the fact that both array are sorted
// and started with last indices of both array and compared them

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums1.length == 0){
            return;
        }
        
        int p1 = m-1, p2 = n-1, i = m+n-1;
        
        while (p1 > -1 && p2 > -1){
            if (nums1[p1] > nums2[p2]){
                nums1[i] = nums1[p1];
                p1 -= 1;
            }
            else{
                nums1[i] = nums2[p2];
                p2 -= 1;
            }
            i -= 1;
        }
        
        while (p2 > -1){
            nums1[i] = nums2[p2];
            p2 -= 1;
            i -= 1;
                
        }
    }
}
            
        
        
        
        