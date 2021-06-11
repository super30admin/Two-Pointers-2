class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        Time Complexity: O(n)
        Space Complexity: O(n)
        """
        
        # create three indeces for num1, num2, and temp        
        i, j, k = 0, 0, 0

        # create a temporary holder for nums1
        temp = nums1.copy()

        # while i and j counters are less than len of nums1 and nums2
        while i < m and j < n:

            # if nums1[i] is less than nums2[j] swap with temp and set i+=1
            if temp[i] < nums2[j]:
                nums1[k] =  temp[i]
                i += 1
            else: # otherwise swap with nums2 and increment j
                nums1[k] = nums2[j]
                j+=1
            # increment k as the current space counter
            k+=1

        # check again nums1 for any leftovers 
        while i < m:
            nums1[k] = temp[i]
            i+=1
            k+=1

        # check the rest of j for any leftovers
        while j < n:
            nums1[k] = nums2[j]
            j+=1
            k+=1