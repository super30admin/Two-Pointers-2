#time O(n)
#space O(1)

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        d = dict()
        l = list()

        for i in nums:
            if i in d:
                if d[i] >= 2:
                    l.append(i)
                else:
                    d[i] += 1
            else:
                d[i] = 1
                        
        for i in l:
            nums.remove(i)
            
        return len(nums)