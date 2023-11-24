class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        s=0
        count1=1
        for i in range(0,len(nums)):
            if i!=0 and nums[i-1]==nums[i]:
                count1+=1
                print(str(i)+"in same"+str(count1))
            else:
                count1=1

            if count1<=2:
                print(str(i)+"in s incre")
                nums[s]=nums[i]
                s+=1
            
        return s

        