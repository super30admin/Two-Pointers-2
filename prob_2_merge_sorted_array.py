class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Time Complexity: O(m)
        Space Complexity: O(1)
        Did this code successfully run on Leetcode: Yes 

        Any problem you faced while coding this: No
        Your code here along with comments explaining your approach:
        The approach: 
            - Use two pointers and place it as m-1 index of nums1 and n-1 index of nums2
            - Run a loop from backwards
                - compare the values at pointer in first list and second list, whichever is greater
                put it in index i. and decrement that pointer by 1 
            - We need to check if the pointer index goes out of range
                - If pointer1 index goes out of range then put all the remaining values of nums[2] in nums[1]
                    - The reason is we don't have any values in nums1 remaining and the remaining values in 
                    nums2 are all sorted and lesser than the values we encountered yes 
                - If pointer2 index goes out of range no need to do anything 
        """        
        p1 = m - 1; p2 = n - 1;
        for i in range(len(nums1)-1, -1, -1):
            if p1 >= 0 and p2 >= 0:
                if nums1[p1] > nums2[p2]:
                    nums1[i] = nums1[p1]
                    p1 -= 1
                else:
                    nums1[i] = nums2[p2]
                    p2 -= 1
            elif p1 >= 0 and p2 < 0:
                pass
            else:
                nums1[i] = nums2[p2]
                p2 -= 1