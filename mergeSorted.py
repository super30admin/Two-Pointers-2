"""
3 pointers: p1 = m - 1, p2 = n - 1, and p = m + n - 1 to fill from end.
While p1 >= 0 and p2 >= 0, keep the larger of nums1[p1] and nums2[p2] at nums1[p] and move pointers.
If p2 has remaining elements, copy them into the beginning of nums1.
"""
"""
Time Complexity: O(m + n)
Space Complexity: O(1) — in-place
"""

class mergeSorted:
    def merge(self, nums1: list[int], m: int, nums2: list[int], n: int) -> None:
        p1, p2, p = m - 1, n - 1, m + n - 1
        while p1 >= 0 and p2 >= 0:
            if nums1[p1] > nums2[p2]:
                nums1[p] = nums1[p1]
                p1 -= 1
            else:
                nums1[p] = nums2[p2]
                p2 -= 1
            p -= 1

            
        nums1[:p2 + 1] = nums2[:p2 + 1]

        print(nums1)

if __name__=="__main__":
    obj = mergeSorted()
    nums1 = [1,2,3,0,0,0]
    m = 3
    nums2 = [2,5,6]
    n = 3
    obj.merge(nums1,m,nums2,n)