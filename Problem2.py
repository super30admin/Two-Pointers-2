#First, I iterate through nums2 and for each element, I append it to the end of nums1. At the same time, I remove a zero from nums1 to maintain the correct length. This effectively replaces the zeros at the end of nums1 with the elements from nums2. After this process, nums1 contains all the elements from both arrays, but they're not in sorted order. So, as a final step, I use Python's built-in sort() method to sort nums1. While this approach isn't the most efficient, especially for large arrays, it's simple and gets the job done. I know there are more optimized solutions that take advantage of the fact that the input arrays are already sorted, but I chose this method for its simplicity and ease of implementation.


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        for i in range(len(nums2)):
            nums1.append(nums2[i])
            nums1.remove(0)
        nums1.sort()