# Time Complexity : O(max(m, n))
# Space Complexity : O(1) as no extra space
# Did this code successfully run on Leetcode : 40/59 test cases
# Any problem you faced while coding this : i did not get the logic completely correct


def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
      
        p1 = m - 1  
        p2 = n - 1
        p = m + n - 1
        while p1 >= 0 and p2 >= 0:
            
            if nums1[p1] >= nums2[p2]:
                nums1[p] = nums1[p1]
                p1 -= 1
            else:
                nums1[p] = nums2[p2]
                p2 -= 1
            p -= 1
        
        if p2 >= 0:
            nums1[:p] = nums2[:p2]
        # if p1 >= 0:
        #     nums1[:p] = nums1[:p1]