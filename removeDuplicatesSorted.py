#Time Complexity : O(n) at every index their is the movement of slow and faster pointer
#Space Complexity : O(1) result is return in form of an integer
#Did this code successfully run on Leetcode : Yes
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        #for null values
        if nums== None:
            return 0
        #defining the slow pointer and fast pointer work will be done by loop itself
        slow =1 
        count =1
        #for loop for removing the duplicacy and it will work like a faster point to iterate over each element 
        for i in range(1,len(nums)):
            if nums[i]==nums[i-1]:
                #increase the count once come across the same number
                count += 1

            else:
                #reseting the count each time new number is encountered
                count =1
            if count <=2:
                #the elements will get overwrite to remove the duplicacy of unneccessary numbers in the array
                nums[slow]= nums[i]

                #slow will get increment for each element with element <= k times
                slow +=1
 
        return slow
