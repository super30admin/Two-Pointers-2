#merge sorted array
#leetcode solution accepted
#space complexity :O(1)
#time complexity: O(m+n) where m and n are len of arr1 and arr2
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        #initialzie pointer 1 and pointer2 at the end of the respecitve array 
        pointer1= m-1 #len(nums1)-1
        pointer2= n-1 #len(nums2)-1
        for p in range(n+m-1,-1,-1): #move p through the array backwords
            if pointer2<0:
                break
            if pointer1>=0 and nums1[pointer1]>nums2[pointer2]:
                nums1[p]=nums1[pointer1]
                pointer1-=1
            else:
                nums1[p]=nums2[pointer2]
                pointer2-=1