# // Time Complexity :O(m+n),m is length of arr1 and n is length of arr2
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no


# // Your code here along with comments explaining your approach




class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        print(nums1)
        print(nums2)
        first=m-1
        second=n-1
        
        for track in range(len(nums1)-1,-1,-1):
            if first>=0 and second>=0:
                print(track)
                if nums1[first]>nums2[second]:
                    nums1[track]=nums1[first]
                    first-=1
                else:
                    nums1[track]=nums2[second]
                    second-=1
                print(nums1)
            
            elif second>=0:
                nums1[track]=nums2[second]
                second-=1
            else:
                break
                
                
        print(nums1)
            
        