#All TC on leetcode passed

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """

        #Here we follow 2 pointer approach. We keep p1 at m and p2 at n and cur pointer at m+n. 
        #Based on num which is greater at p1 or p2 pointers we move it into cur position and 
        #decrement cur and p1/p2 pointers. At the end if p2 pointer hasnt reached 0 => still elements 
        #present then we move all elements into nums1 one by one. If p1 pointer hasnt reached 0 then we 
        #dont have to move anything as they are already in nums1 in sorted order.
        #Time complexity - O(m+n)
        #Space complexity - O(1)
        p1 = m-1
        p2 = n-1
        cur = m+n-1

        while p1>=0 and p2>=0:
            if nums1[p1]>nums2[p2]:
                nums1[cur] = nums1[p1]
                p1-=1
            else:
                nums1[cur] = nums2[p2]
                p2-=1
            cur-=1

        while p2>=0:
            nums1[cur] = nums2[p2]
            p2-=1
            cur-=1
        
        return 

        