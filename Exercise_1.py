# ## Problem1 (https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)

# // Time Complexity :
# // Space Complexity :
# // Did this code successfully run on Leetcode :
# // Three line explanation of solution in plain english

# // Your code here along with comments explaining your approach

def removeDuplicates(nums):
    # 2 ptrs -> slow and fast
    s = 0
    f = s + 1
    count = 1
    k = 2
    # iterating over the array from 1 position
    for f in range(1, len(nums)):
        # checking if the elements are same
        if nums[f] == nums[f - 1]:
            # increasing count
            count += 1
        else:
            # if not making count back to 1
            count = 1
        # count reaches target
        if (count <= k):
            # increasing s ptr by 1 coz (count needs to be k)
            s += 1
            # updating s with f
            nums[s] = nums[f]
    print(nums)
    return s + 1


nums = [1, 1, 1, 2, 2, 3]
print(removeDuplicates(nums))
