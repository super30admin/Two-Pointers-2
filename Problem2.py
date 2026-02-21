class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        f, s = m-1, n-1
        rear = m+n-1

        while f >= 0 and s >= 0:
            if nums2[s] > nums1[f]:
                nums1[rear] = nums2[s]
                s -= 1
                
            else:
                nums1[rear] = nums1[f]
                f-=1
            
            rear -= 1

        #rear += 1
        while s >= 0:
            nums1[rear] = nums2[s]
            s-=1
            rear -= 1

        # if f >=0:
        #     nums1[rear] = nums1[f]
        #     f-=1
        #     rear-=1
        


        
