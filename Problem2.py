''' 
Time Complexity: O(N)
Space Complexity: O(N)

Approach:
We use two pointers: fast and slow.
We move the pointers in a while loop, and increment the slow pointer when the frequency of the current element is less than or equal to K. 
We move the pointers in a while loop, and increment the fast pointer when the frequency of the current element is greater than or equal to K. 
We swap the elements at the slow and fast pointers when the frequency of the current element is less than or equal to K. 
Finally, we return the new length of the array. 

Please note that this code is written for a generic K, but the question specifically asks for K = 2.
'''

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        
        fast, slow = 0, 0 
        N = len(nums)
        K = 2
        freqMap = defaultdict(int)
        while fast < N:
            freqMap[nums[fast]]+=1
            if freqMap[nums[fast]]<=K:
                temp = nums[slow]
                nums[slow]= nums[fast]
                nums[fast] = temp 
                slow+=1 
            fast+=1 
        
        return slow
            
            


