#Time Complexity O(nums1)
#Space Complexity o(1)

#problem successfully compiled on leetcode
#No problems faced while coading



class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        i=m+n-1
        ptr1=m-1
        ptr2=n-1
        
        while(ptr1>=0 and ptr2>=0):
            if(nums1[ptr1]>nums2[ptr2]):
                nums1[i]=nums1[ptr1]
                ptr1-=1
            else:
                nums1[i]=nums2[ptr2]
                ptr2-=1
            i-=1
            
        while(ptr2>=0):
            nums1[i]=nums2[ptr2]
            ptr2-=1
            i-=1
