def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        #TC:O(m+n) SC:O(1)
        p1=m-1
        p2=n-1
        slow=len(nums1)-1
        while p1>=0 and p2>=0:
            if nums1[p1]>nums2[p2]:
                nums1[slow]=nums1[p1]
                p1-=1
            else:
                nums1[slow]=nums2[p2]
                p2-=1
            slow-=1
        while p2>=0:
            nums1[slow]=nums2[p2]
            slow-=1
            p2-=1
        return nums1
        