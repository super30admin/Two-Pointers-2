// Time Complexity : O(n+m), m is size of nums1 array and n is size of nums2 array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes



class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        if(nums1 == null || nums1.length == 0) return; 
        //Keep 3 pointers at end of m (tempm), n(tempn) and nums1(index)
        
        int index = nums1.length-1;
        int tempm = nums1.length-n-1;
        int tempn = nums2.length-1; 
        //iterate till both are >= 0
        while(tempm >= 0 && tempn >= 0) {
            //we compare values at tempm and tempn and we copy the larger element to position index
            if(nums1[tempm] > nums2[tempn]) {
                nums1[index] = nums1[tempm];
                index--; tempm--;
            }
            else {
                nums1[index] = nums2[tempn];
                index--; tempn--;
            }
        }       
        
        //if tempm is out of bound, we just need to copy elements from nums2 to nums1
        // if tempn is out of bound, we do not do this operation as both tempn and index are in same array 
        while(tempn >= 0) {
            nums1[index] = nums2[tempn];
            index--; tempn--;          
        }       
        
    }
}
