class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        # TC O(m +n)
        # SC O(m +n)
        if (nums1 is None or len(nums1) == 0 )and (nums2 is None or len(nums2) == 0):
            return []
        elif nums1 is None or len(nums1) == 0 :
            return nums2
        elif (nums2 is None or len(nums2) == 0):
            return nums1
        res = [0] *(m + n)
        i =0
        j = 0
        k=0
        while(i < m and j < n):
            if (nums1[i] < nums2[j]):
                res[k] = nums1[i]
                
                i += 1
            else:
                res[k] = nums2[j]
                j += 1
            k += 1
      
        while( i < m):
            res[k] = nums1[i]
            k += 1
            i +=1
        while( j < n):
            res[k] = nums2[j]
            k += 1
            j +=1
        for p in range(m+n):
            nums1[p] = res[p]
