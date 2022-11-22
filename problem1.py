#time complexity: O(n)
#space complexity: O(1)
#ran on leetcode: yes
#have two pointers i and j. i will point to the last element i of the valid sequence. 
#j is used to traverse the array. check if j-1 and j are same elements. if they are not
#same, then resent count to 1 and store this element in i+1 and increment i. If not, 
#then check the count. If count>2 then this element has occurred twice already so increment
#the count. If not then increment count and store this element in i+1 since this element should 
#be part of valid numbers. Increment i.
class Solution:
    def removeDuplicates(self, nums) -> int:
        i=0
        count=1
        for j in range(1,len(nums)):
            if(nums[j]==nums[j-1]):
                count+=1
                if(count>2):
                    count+=1
                    continue
                else:
                    #temp=nums[i+1]
                    nums[i+1]=nums[j]
                    i+=1
                    #nums[j]=temp
            else:
                count=1
                #temp=nums[i+1]
                nums[i+1]=nums[j]
                i+=1
        return i+1
        
s=Solution()
nums = [0,0,1,1,1,1,2,3,3]
k=s.removeDuplicates(nums)
print(nums[:k])