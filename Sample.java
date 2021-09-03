
// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english 
    //1. we take the last position of first array as the position where we will put the compareed element
    //2. we iterate from the last nonzero elements in both arrays and check their values and whichever is greater, we will put it on the pointer position(step 1) in the first array
    //3. we perform step 2 till we reach the first element of the second array and then we stop

// Your code here along with comments explaining your approach
class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        marr=m-1
        narr=n-1
        point=m+n-1
        while marr>=0 and narr>=0:
            if(nums1[marr]>nums2[narr]):
                nums1[point]=nums1[marr]
                marr=marr-1
            elif(nums1[marr]<nums2[narr]):
                nums1[point]=nums2[narr]
                narr=narr-1
            else:
                nums1[point]=nums1[marr]
                marr=marr-1
            point=point-1
        while(narr>=0):
            nums1[point]=nums2[narr]
            narr=narr-1
            point=point-1
