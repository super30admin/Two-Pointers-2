class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i=1
        j=1
        n=len(nums)
        if(n<3):
            return 2
        count=1
        k=2
        while(j<n):
            if(nums[j-1]==nums[j]):
                count+=1
            else:
                count=1
            if(count<=k):
                nums[i]=nums[j]
                i+=1
            j+=1
                
            #     if(count<=k):
            #         i+=1  
            #         # print(i)  
            #         if(i<n and (i-1>=0)and nums[i]!=nums[i-1]):
            #             count=0
            #     j+=1
            # else:
            #     count=1
            #     if(count<=k):
            #         print((i,j),nums[i],nums[j])
            #         nums[i]=nums[j]
            #         i+=1
            #         if(i+1<n and nums[i]==nums[i+1]):
            #             j=i
                
            

        return i