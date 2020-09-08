# Leetcode problem link : https://leetcode.com/problems/merge-sorted-array/
# Time Complexity : O(n)
#  Space Complexity : O(1)
#  Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
'''
        Basic approach : O(n+m(log(n+m))) => As nums1 contains space to accommodate both so we merge both the arrays and sort. So number of elements are m+n now hence time complexity is O(n+m(log(n+m)))

        Optimized approach: O( n ) => Keep two pointers, one which is traversing the nums1 array from the end and the other traversing nums2 from the end.
        2. Current pointer will keep track of location in nums1 to be updated.
        3. Compare the elements in nums1 and nums2. Whichever is bigger is updated in nums1 at current pointer position.
        4. Decrement the current pointer and pointer of the array whose element just got udpated
'''
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        # edge case when nums1 or nums2 is empty
        if not nums1 or not nums2:
            return
        # i will be pointing to last element of nums1
        i = m-1
        # j will point to last element of nums2
        j = n-1
        # current pointer will update at the end of nums1 array(as it has capacity of m+n)
        curr = m+n-1
        
        #traverse till one of them reaches the starting index
        while i>= 0 and j >=0:
            # compare and copy to current pointer position whichever is bigger, decrement relevant counters
            if nums1[i] > nums2[j]:
                nums1[curr] = nums1[i]
                i -= 1
            else:
                nums1[curr] = nums2[j]
                j -= 1
            curr -= 1
        # copy remaining elements from nums2 if left any (nums1 will anyway have its own remaining elements)
        while j >= 0:
            nums1[curr] = nums2[j]
            curr -= 1
            j -= 1