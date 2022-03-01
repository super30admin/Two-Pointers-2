// Time Complexity : O(m+n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


'''
Algorithm

'''



#Merge sorted array	
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        
        p1=m-1
        p2=n-1
        i=m+n-1
        
        while(p1>=0 and p2>=0):
            if nums1[p1]>nums2[p2]:
                nums1[i]=nums1[p1]
                p1=p1-1
            else:
                nums1[i]=nums2[p2]
                p2=p2-1
            i=i-1
        while p2>=0:
            nums1[i]=nums2[p2]
            p2=p2-1
            i=i-1
        
        return nums1