#Time Complexity : O(m + n) where m and n are lengths of array 1 and array 2 respectively
#Space Complexity: O(1)

#Accepted on Leetcode

#Approach: 
#Keep two pointers i and j at the last numbers (m - 1 and n - 1 index) of Arr 1 (A) and Arr 2 (B) respectively and a pointer k at the last index of Arr 1
#Compare A[i] and B[j] at each iteration and overwrite A[k] with the greater of the two, just like we do in Merge Sort (Merge Function). Decrement i/j and k accordingly at each iteration
#Once any of the arrays is exhausted, copy the entire remaining array to A[k] (if B is the remaining one) and return

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        A = nums1
        B = nums2
        i = m - 1
        j = n - 1
        k = n + m - 1

        while i >= 0 and j >= 0:
            if A[i] > B[j]:
                A[k] = A[i]
                i-=1
            else:
                A[k] = B[j]
                j-=1
            k-=1

        while j>=0:
            A[k] = B[j]
            j-=1
            k-=1
        
        return A