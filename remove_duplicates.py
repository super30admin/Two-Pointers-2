'''
TC:O(N)
SC:O(1)
'''
class Solution:
    def duplicates(self,array):
        if not array:
            return 0

        j=1
        count =1
        for i in range(1,len(array)):
            if array[i] == array[i-1]:
                count+=1
            else:
                count = 1
            if count <=2:
                array[j] = array[i]
                j+=1

        return j
print(Solution().duplicates([0,0,1,1,1,1,2,3,3]))