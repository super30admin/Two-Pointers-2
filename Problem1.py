"""
// Time Complexity : mentioned in code
// Space Complexity : mentioned in code
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english:
for overwrite duplicates approach
--> for a number, we are keeping a track of repititions and when there is more than 2 repitions we overwrite with the next valid number.
--> the position pointed by the tracking pointer gives the length of valid list


// Your code here along with comments explaining your approach
"""
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if not nums:
            return 0
        
        """
        by deleting every invalid element 
        
        time complexity : o(n^2) as deletion is o(n) 
        space complexity : o(1)
        """
        """
        i = 0
        ct = 1 #keeps check on repitions
        j = i+1
        n = len(nums) #keeps track of length

        while i < n - 1:
            if j>n-1:# if j goes out if bounds then break
                break
                #print (len(nums))
            if nums[j] == nums[i] and ct == 2: #if value at is same as value at i and ct is 2 already then we delete value at jth index
                del nums[j]
                n =  n-1 #and reduce the length
            elif nums[j] == nums[i]: #else when ct is less than 2, increment j and ct
                j += 1
                ct = ct+1
            elif nums[j] != nums[i]: #when value at i and j are unequal, set i to j and j to next element and ct to 1
                i = j
                j = j + 1
                ct = 1
        #print (len(nums))
        return len(nums) #return length
        """
        
        """
        overwrite duplicates
        time complexity : o(n)
        space complexity : o(1)
        """
        
        j = 1 #keeps track of valid values
        count =  1
        
        for i in range(1, len(nums)): #iterate over entire array
              
            if nums[i] == nums[i - 1]: #checks with previous value, if same increment count
                count += 1
            else:
                
                count = 1 #if unequal reset count to 1
                
            if count <= 2:
                nums[j] = nums[i] #put value at i at position j and increment j to point to immediate next position
                j += 1
                
        return j
                
                