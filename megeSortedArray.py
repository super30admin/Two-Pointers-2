"""
88. Merge Sorted Array

Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Approach 1 ---
1. Set two pointers : One at the end of nums1(before the 0s start) and Second at end of nums2
2. Iterate the array in reverse order, coparing elements in nums1 and nums2; storing max element at the end
3. Break when ptr is < 0

Time = O(n), n = number of elements in nums1
Space = constant = O(1)
Successfully excecuted on leetcode


"""
class MergeSortedArray:
        
    # 1. Edge cases - nums1 = [2,0], nums2 = [1] ; expected = [1,2] , actual = [2,2]
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        
        if not nums2:
            return nums1
        if not nums1 and not nums2:
            return []
        
        ptr1 = m-1
        ptr2 = n-1
        
        for i in range(m+n-1,-1,-1):
            if ptr2 < 0 :
                break
            if nums1[ptr1] > nums2[ptr2]:
                nums1[i] = nums1[ptr1]
                ptr1 -= 1
            else:
                nums1[i] = nums2[ptr2]
                ptr2 -= 1
           
        print(nums1,"here")
    
    
"""
Approach 2 ---
1. Set three pointers : One at the end of nums1(before the 0s start), Second at end of nums2, third at the end of nums1(m+n-1)
2. Use while loop, update the index after comparing nums1 and nums2 elements and storing max out of both
3. Iterate once more to store if there's any remaining elements in nums2

Time = O(n), n = number of elements in nums1
Space = constant = O(1)
Successfully excecuted on leetcode """


class MergeSortedArray:
        def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
            p1 = m-1
            p2 = n-1
            index = m+n-1
            while p1 >=0 and p2 >= 0:
                if nums1[p1] < nums2[p2]:
                    nums1[index] = nums2[p2]
                    index -= 1
                    p2 -= 1
                else:
                    nums1[index] = nums1[p1]
                    p1 -= 1
                index -= 1
            while p2 >= 0:
                nums1[index] = nums2[p2]
                index -= 1
                p2 -= 1
                
