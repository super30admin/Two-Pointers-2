class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        left = m-1
        right = n-1

        p = m+ n -1

        while left >=0 and right >= 0:
            if nums1[left] < nums2[right]:
                nums1[p] = nums2[right]
                right = right -1
            else:
                nums1[p] = nums1[left]
                left-= 1
            p -=1

        nums1[:right +1] = nums2[:right +1]

        return(nums1)



"""
1) Pointers are taken, left and right. Left starts from end of the first array and right starts from end of the second array.
2) Another pointer is taken as p, which points to the middle index, which will be used to placement of the numbers in the first array.
3) Elements in the first array are compared with the second and they are placed in the first array.
 """

 """
 Time Complexity: 0(n)
 Space: O(1)

 """        
