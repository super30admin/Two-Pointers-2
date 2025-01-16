#space: O(1)
#Time: O(m + n)
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        total=m+n-1
        while ( m>0 or n>0 ):
            if(n == 0):
                break
            elif( m == 0 or nums1[m-1] < nums2[n-1]):
                nums1[total]= nums2[n-1]
                total= total -1
                n= n-1
            else:
                nums1[total]= nums1[m-1]
                m= m -1
                total=total -1
        return nums1
            
        
