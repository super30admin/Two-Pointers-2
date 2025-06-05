def remove_duplicates(nums, k):
    slow = 1
    count = 1
    for i in range(1, len(nums)-1):
        if nums[i] == nums[i-1]:
            count+=1
        else:
            count=1

        if count <= k:
            nums[slow] = nums[i]
            slow += 1
    return slow

if __name__ == "__main__":
    nums = [1,1,1,2,2,3]
    k = 2
    remove_duplicates(nums, k)