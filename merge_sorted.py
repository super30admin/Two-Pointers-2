# Time Complexity :
# O(N+M)  - Size of the Matrix

# Space Complexity :
# O(1) - There is no auxillary space being allocated

# Did this code successfully run on Leetcode :
#Yes

#We start processing the arrays from the back. We store 2 pointers to the end of the 2 arrays and another pointer to the last element
#We compare the elements at the end of the arrays and the one bigger is moved to the last location in the larger array and move the final end pointer backwards
#We keep doing this until we have processed all elements

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        i = m-1
        j = n-1
        end_pointer = n + m -1
        while i >= 0  or j >= 0 :
            if i >= 0 and j >= 0 : 
                if nums1[i] > nums2[j] :
                    nums1[end_pointer] = nums1[i]
                    i -= 1
                    end_pointer -= 1
                else :
                    nums1[end_pointer] = nums2[j]
                    j -= 1
                    end_pointer -= 1 
            #If one array is processed, process only other array
            elif i < 0 :
                nums1[end_pointer] = nums2[j]
                end_pointer -= 1
                j -= 1
            #If one array is processed, process only other array
            elif j < 0 :
                nums1[end_pointer] = nums1[i]
                end_pointer -= 1
                i -= 1
