
# Brute Force: With additional space, hashmap we can store the frequencies and remove duplicates accordingly
# O(N) solution


#Optimized: Doing it in place --- O(1)
# Time O(N)
# Use 2 pointers slow and fast

def removeDuplicates(nums):

    slow = 1
    fast = 1
    count = 1

    while fast < len(nums):
        if nums[fast] == nums[fast-1]:
            count += 1

        else:
            count = 1

        if count <= 2:
            nums[slow] = nums[fast]
            slow += 1

        fast += 1

    return slow