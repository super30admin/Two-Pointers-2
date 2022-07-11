# time complexity: O(m+n)
# space complexity: O(1)
# Approach: assign 3 pointers p1,p2,p
# p1 starts from m-1
# p2 starts from n-1
# p starts from last index of first array(m+n-1)
# put the maximum element at index p and decrement the index whichever was added.
# decrement p
# if any of p1 or p2 becomes 0,
# break the loop and fill the remaining elements 


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        p1 = m-1
        p2 = n-1
        p = m+n-1
        while(p1 >= 0 and p2 >=0):
            if(nums2[p2]>nums1[p1]):
                nums1[p]=nums2[p2]
                p2 = p2-1
            else:
                nums1[p] = nums1[p1]
                p1 = p1-1
            p =p-1
        while(p2>=0):
            nums1[p]= nums2[p2]
            p2 = p2-1
            p = p-1
        while(p1>=0):
            nums1[p]= nums1[p1]
            p1 = p1-1
            p = p-1
        
              
              
            
        