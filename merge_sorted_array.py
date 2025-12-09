# https://leetcode.com/problems/merge-sorted-array/

# Using two pointers started updenting the elements from second array into the first array. While doing that, compare the last element of the first array with last element of second array and update accordinlgy

# Time Complexity- O((m+n) Space Complexity- O(1)
class Solution:
    def merge(self, nums1: list[int], m: int, nums2: list[int], n: int) -> None:
        # finding the last index of the merge array
        last_index= m + n - 1

        # merge from last index
        while m > 0 and n > 0:
            # checking whether the last element of first array is greater than the last element of second array 
            if nums1[m - 1] > nums2[n - 1]:
                # update the last index of the nums1 with greater element
                nums1[last_index] = nums1[m - 1]
                # decrement the index 
                m -= 1
            # when the last element of second array is greater than the last element of first array
            else:
                nums1[last_index] = nums2[n - 1]
                # decrement the index
                n -= 1
            # decrement the last index 
            last_index -= 1

        # update the remaining elements from second array into the first array
        # check if n is greater than 0 after decrementing
        while n > 0:
            # update with the elements
            nums1[last_index] = nums2[n-1]
            # decrement the pointer
            n = n - 1
            last_index = last_index - 1
    
solution = Solution()
print(solution.merge([1,2,3,0,0,0],3,[2,5,6],3))
            