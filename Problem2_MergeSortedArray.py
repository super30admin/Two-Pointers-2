# Time Complexity: O(m + n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes

# Solution:
"""
1. Consider 2 pointers to point to end of the 2 arrays and another pointer to update the result backwards.
2. Starting from the end, compare the 2 pointer elements and update the maximum value by iterating backwards.
3. Finally, include the remaining elements if there are any.
"""

def mergeSortedArray(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
    if not nums1 or len(nums1) is 0:
        return

    # Pointers i and j to point to end of their respective arrays
    i = m - 1
    j = n - 1

    # Pointer k to update nums1 backwards
    k = m + n - 1

    # Compare the elements from the end and update the maximum value
    while i >= 0 and j >= 0:
        if nums1[i] >= nums2[j]:
            nums1[k] = nums1[i]
            i -= 1
        else:
            nums1[k] = nums2[j]
            j -= 1
        k -= 1

    # Add the remaining elements to nums1.
    while j >= 0:
        nums1[k] = nums2[j]
        j -= 1
        k -= 1