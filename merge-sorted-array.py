def merge(nums1, m, nums2, n):
    """
    Do not return anything, modify nums1 in-place instead.
    """

    '''
    Start taking elements from end of nums2 and see if the value is less than last element of m
    append the value in the last position of nums1.
    
    else, replace the mth element in nums1 in the index of m+n
    '''

    while n:
        if m and nums1[m - 1] >= nums2[n - 1]:
            nums1[m + n - 1] = nums1[m - 1]
            m -= 1
        else:
            nums1[m + n - 1] = nums2[n - 1]
            n -= 1

nums1 = [1,2,3,0,0,0]
m = 3
nums2 = [2,5,6]
n = 3
merge(nums1, m, nums2, n)
print(nums1)

'''
Time complexity : O(N) N - elements in nums2
space complexity - O(N)
'''