# Time Complexity : O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# 2 poniters slow and i. i counts number of elements and slow is where we replace the element. 
# count maintains number of same elements.
# while count is less than k we keep replacing ele at slow
# once it exceeds reset count.
def removeDuplicates(self, nums: List[int]) -> int:
    if len(nums)<=2:
        return len(nums)
    slow =  0
    count = 1
    k =2
    for i in range(len(nums)):
        if i >0 and nums[i] == nums[i-1]: #if same then inc count
            count+=1
        else: #if i = 2 and i-1 = 1 reset count to 1
            count = 1
        if count<=k: #if count is less the k then put i to slow and inc slow
            nums[slow] = nums[i]
            slow+=1
    return slow