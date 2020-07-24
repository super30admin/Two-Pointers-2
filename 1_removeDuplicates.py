def solution(nums):
    '''
    Approach:
    1. using 3 pointers, slow pointer indicates all values before it are traversed.
    2. fast pointer quickly moves to new values and prev=fast and slow moves one step and fast moves to nex and flag=0
    3. if flag ==0 then only move make nums[slow]=nums[fast]
    4. slow pointer will keep record of the desired lenght.

    time complexity = O(n)
    space complexity = O(1)
    Working on LC= yes
    '''
    prev=0
    slow=1
    fast=1
    flag=0
    while(fast<len(nums)):
        if nums[fast] == nums[prev]:
            if flag == 0:
                nums[slow] = nums[fast]
                slow += 1
                fast += 1
                flag += 1
            else:
                fast +=1
        else:
            prev=fast
            nums[slow]=nums[fast]
            slow += 1
            fast +=1
            flag = 0
    return slow


nums=[1,1,1,1,1,1,1,1,1,1,2,2,2,2,3,5,6,6,6]
solution(nums)
print(nums)