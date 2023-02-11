#Time Complexity : O(N), N being the length of the array. 
#Space Complexity : O(1), because no extra array was used. 
#Did this code successfully run on Leetcode : Yes.
#Any problem you faced while coding this : Took forever to debug. May have been half
#asleep in the beginning while debugging, too. But it seemed like I was missing 
#indices or something. It was terrible. But I learned to use the whiteboard/notebook. 
#And the debugging with examples on leetcode also worked.

#Your code here along with comments explaining your approach in three sentences only
'''Have an end and high pointer. Move the higher pointer if there is a duplicate, until
there is a different number. Then move end pointer once. 
'''
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums)==0:
            return 0
        else:
            end = 1
            high = 1
            save_value = nums[0]
            save = 1
            while(high<len(nums)):
                #if save value is equal to high pointer, count save value. 
                if save_value==nums[high]:
                    if save<2:
                        nums[end]=nums[high]
                        save = save+1
                        high = high+1
                        end = end+1
                    else:
                        nums[end]=nums[high]
                        high =high+1             
                #else reinitialize save to 1. 
                else:
                    nums[end]=nums[high]
                    save=1
                    save_value = nums[high]
                    high = high+1
                    end = end+1
                    save = 1

            return end