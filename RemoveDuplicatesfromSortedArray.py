class Solution:
    def removeDuplicates(self,nums):
        if len(nums)<=2:
            return len(nums)
        
        insert_pos=2
        for i in range (2,len(nums)):
            if nums[i]!=nums[insert_pos-2]:
                nums[insert_pos]=nums[i]
                insert_pos+=1
        return insert_pos

nums=[0,0,1,1,1,1,2,3,3]
expectedNums=[0,0,1,1,2,3,3,]
sol = Solution()
N=sol.removeDuplicates(nums)

assert isinstance(N,int),"Return type must be integer"
assert N==len(expectedNums)

for i in range(N):
    assert nums[i]==expectedNums[i]

print(N,"Nums =",nums[:N])
