class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        first = m-1
        second = n-1
        curr = len(nums1)-1

        while first >= 0 and second >= 0:#stop when either array is exhausted
            if nums1[first] > nums2[second]:
                nums1[curr] = nums1[first]
                first -= 1
                curr -= 1
            else:
                nums1[curr] = nums2[second]
                second -= 1
                curr -= 1

        if first < 0:#first array got exhausted, then copy second to first. Meaning we processed all elements in first array to their correct position
            while second >= 0:
                nums1[curr] = nums2[second]
                curr -= 1
                second -=1

        #if second array got exhausted do nothing. as it will be correctly placed to the end of the nums1 array.


#if we start from the begining of array, there is a chance we may lose the sorting
#[5 6 7 0 0 0] [2 3 4] -> second array can become [5 3 4], we are losing sorting
# so start from where there is no issue of overwriting. we won't lose sorted order. so
# collect and put to the last. Collecting pointer from last.
# Collecting point shud start from the end, if it stars from the begining the we can  lose sorting.
# comparing pointers start from the end as well bcuz bigger no can go to the end.  

# Time Complexity: O(m+n)
# Space Complexity: O(1)