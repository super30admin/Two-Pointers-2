# Time complexity : O(m+n)
# Space Complexity : O(1)
def merged_sorted_array(nums1, m, nums2, n):
    start = m - 1
    end = len(nums1)-1
    j = len(nums2)-1

    while j >= 0:
        if nums2[j] >= nums1[start]:
            nums1[end] = nums2[j]
            end -= 1
            j-=1
        else:
            nums1[end] = nums1[start]
            start-=1
            end-=1
    return nums1
    

if __name__ == "__main__":
    nums1 = [1]
    m = 1
    nums2 = []
    n = 0
    print(merged_sorted_array(nums1, m, nums2, n))