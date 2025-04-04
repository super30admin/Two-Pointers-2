# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# We are taking Two pointers slow and fast. We are taking a count variable to keep track of the number of times the element is repeated. If the element is repeated more than k times, we are not incrementing the slow pointer. If the element is repeated less than k times, we are incrementing the slow pointer and putting the element at the slow pointer. We are doing this until we reach the end of the array. We are returning the slow pointer.
def remove_duplicates(nums):
    n = len(nums)
    fast = 0
    slow = 0
    count = 0
    k = 2  

    while fast < n:
        if fast > 0 and nums[fast] == nums[fast - 1]:
            count += 1
        else:
            count = 1

        if count <= k:
            nums[slow] = nums[fast]
            slow += 1

        fast += 1

    return slow
