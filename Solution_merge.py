"""
Time complexity O(m+n)
Space complexity O(1)
"""
class Solution_merge:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        
        low=m-1   #set low pointer in the (m-1) index
        high=n-1  #set high pointer in the (n-1) index
        k=m+n-1   #set k pointer in the last 0 (m+n-1)th index of nums1
        if n<1:   #when n=0, nothing to modify in nums1
            return 
        if m<1   :#when m=0, copy nums2[n-1] to nums1
            nums1[m]=nums2[n-1]
        while low>=0 and high>=0:
            #print(low,high)
            #print(k)
            if nums1[low] >= nums2[high]: #if low idx value is gt than high index val , swap low element with k pointer.
                nums1[k] = nums1[low]
                low-=1
                k-=1
            else:#nums1[high] >= nums2[low]:
                nums1[k] = nums2[high]
                high-=1
                k-=1
            #print(nums1)
            #print(k)
        while high>=0: #Copy the extra element in nums2 to nums1
            nums1[k]=nums2[high]
            high-=1
            k-=1
            