# // Time Complexity : O(n+m)
# // Space Complexity : O(1)

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        i,j,k= m-1,len(nums2)-1,len(nums1)-1

        while(k>=0):
            if(j>=0 and i>= 0 and(nums2[j] > nums1[i])):
                nums1[k] = nums2[j]
                j-=1
            elif(j>=0 and i<0):
                while(j>=0):
                    nums1[k]=nums2[j]
                    j-=1
                    k-=1
                break
                
            else:
                nums1[k] = nums1[i]
                i-=1
            k-=1
          


            