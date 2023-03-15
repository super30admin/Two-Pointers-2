# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : yes
# Three line explanation of solution in plain english
#keep count of each number,when count =3, move p1 to p2 and exchange p1 and p2
# if count of p2 <=2 and p1>=3
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums)==1:
            return 1
        if len(nums)==2:
            return 2
        p1=0
        p2=0
        d={}
        while p1<=p2 and p2<len(nums):
            if nums[p2] not in d:
                d[nums[p2]]=1
            else:
                d[nums[p2]]+=1
            if(d[nums[p2]]==3):
                if nums[p1]!=nums[p2]:
                    if d[nums[p1]]<=2:
                        p1=p2
                else:

                # move p1 to p2,p1 is the number to move behind
                    p1=p2
            if(nums[p1]!=nums[p2] and d[nums[p1]]> 2 and d[nums[p2]] <=2):
                x= nums[p1]
                nums[p1]=nums[p2]
                nums[p2]=x
                p1+=1
            p2+=1
        print(p1)
        if p1==0:
            return len(nums)
        return p1
            
