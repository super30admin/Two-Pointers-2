def removeduplicates(nums):
    k=2
    n= len(nums)
    count = 1
    slow = 0
    for i in range(1,n):
        if nums[i]==nums[i-1]:
            count+=1
        else:
            count=1
        if count<=k:
            slow+=1
            nums[slow]= nums[i]
        
    return nums
    

nums = [0,0,1,1,1,1,2,3,3]
print(removeduplicates(nums))