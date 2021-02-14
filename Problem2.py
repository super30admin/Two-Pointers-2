"""
88. Merge Sorted Array
Time Complexity - O(n+m)
Space Complexity - O(1)
Check if given list is not empty
Here we are checking condition from Last element and then going toward small index i = m-1, j = n-1
While loop verifying if index of both the list doesnt go out of bound
    if value for nums2 is reater than value of nums1
        copy nums2 value in k = m+n-1 location
            decrement index of j and k
    else
    copy nums1 value in k = m+n-1 location
            decrement index of i and k
if nums2 j is greater than or equal to 0 that means values of nums1 has been completely copied
Using while loop copy rest of elements
    """

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
 
        if nums1 == None or nums2 == None or len(nums1) == 0 or len(nums2) == 0:
            return 0
        i = m-1
        j = n-1
        k = m+n-1
        
        while (i >= 0 and j >= 0 ):
            if nums1[i] < nums2[j]:
                nums1[k] = nums2[j]
                j -= 1
                k -= 1
            else:
                nums1[k] = nums1[i]
                k -= 1
                i -= 1
        
        if j >= 0:
            while j >= 0:
                nums1[k] = nums2[j]
                j -= 1
                k -= 1

                