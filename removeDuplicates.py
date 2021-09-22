# Time Complexity: O(n), We loop over the input array once 
# Space Complexity: O(1), Modification of the input array is done in place. 
def removeDuplicates(nums: list[int]) -> int:
    if not nums or not len(nums):
        return 0
    cnt = 1
    i = 1
    j = 1
    while i < len(nums):
        if nums[i] == nums[i-1]:
            cnt += 1
        else:
            cnt = 1
        if cnt <= 2: # Can work with any k
            nums[j] = nums[i]
            j+=1
        i+=1
    return j