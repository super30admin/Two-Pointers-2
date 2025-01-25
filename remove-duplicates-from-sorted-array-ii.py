# tc O(n), sc O(1).
slow = 0
duplicate_found = False

for fast in range(1, len(nums)):
    if nums[fast] == nums[slow]:
        if duplicate_found:
            continue
        duplicate_found = True
    elif nums[fast] != nums[slow]:
        duplicate_found = False
        
    slow += 1
    nums[slow] = nums[fast]
    

return slow + 1