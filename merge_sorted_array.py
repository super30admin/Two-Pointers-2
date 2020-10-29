# Time Complexity(O(n+m))
# Space Complexity:- O(1)
# Approach:- Start from the back of nums1. Initialize 3 pointers one on len(nums1)-1,another on len(nums2)-1 and another on m. We will compare nums1[m] to nums2[n] whichever is bigger we will overwrite that value with nums1[i] and decrement our pointers
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        i,j=len(nums1)-1,n-1
        k=m-1
        while(k>=0 and j>=0):
            if nums1[k]>=nums2[j]:
                nums1[i]=nums1[k]
                i-=1
                k-=1
            else:
                nums1[i]=nums2[j]
                i-=1
                j-=1
        while(j>=0):
            nums1[i]=nums2[j]
            j-=1
            i-=1
        #2nd approach use a temp array and write the to the tempo array and then finally overwrite nums1 with temp array.
        # i,j=0,0
        # temp=[]
        # while(i<m and j<n):
        #     if nums1[i]<=nums2[j]:
        #         temp.append(nums1[i])
        #         i+=1
        #     else:
        #         temp.append(nums2[j])
        #         j+=1
        # if i<m:
        #     while(i<len(nums1)):
        #         temp.append(nums1[i])
        #         i+=1
        # elif j<n:
        #     while(j<len(nums2)):
        #         temp.append(nums2[j])
        #         j+=1
        # for i in range(len(nums1)):
        #     nums1[i]=temp[i]