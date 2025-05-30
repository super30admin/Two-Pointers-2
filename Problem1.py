''' 
Time Complexity: O(n) 
Space Complexity: O(1) 

Approach:
We use three pointers: p1 for the end of nums1, p2 for the end of nums2, and p3 for the end of the merged array.
In a while loop, we compare the elements at p1 and p2, placing the larger one at p3 and moving the respective pointer back. 
We continue this process until one of the pointers reaches the end of its array. 
Finally, we move the remaining elements of the other array to the end of the merged array.

'''

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        
        p1, p2, p3 = m-1, n-1, (m+n)-1 

        while p1 >=0 and p2>=0: 
            if nums1[p1] > nums2[p2]:
                nums1[p3] = nums1[p1]
                p3-=1 
                p1-=1 
            else:
                nums1[p3] = nums2[p2]
                p3-=1
                p2-=1 
        
        while p2>=0:
            nums1[p3] = nums2[p2]
            p2-=1 
            p3-=1 
        

