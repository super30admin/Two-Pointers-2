'''
80. Remove Duplicates from Sorted Array II
Problem Name: Edit and Remove Duplicates in an array

Source Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
'''

# Time Complexity : O(n) for all approaches
# Space Complexity : O(n) for Approach 1, O(1) for Approach 2 and Approach 3
# Did this code successfully run on Leetcode : Yes, all approaches
# Any problem you faced while coding this : Yes, understanding the problem statement and how to handle duplicates efficiently.

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        # Apporach 1:
        '''
        • We track how many times each number appears using a map.
        • If a number appears ≤ k times, we add it to a result list.
        • Then we copy that list back to the original array.
        Time Complexity: O(n)
        Space Complexity: O(n)
        '''
        # count = {} # humne dictionary ka use kiya hai to count the frequency of each number(We have used dictionary to count the frequency of each number)
        # result = [] # for num in nums: # humne nums ke har element ko iterate kiya hai (We have iterated through each element of nums)
        # k = 2 # humne k ki value 2 set ki hai kyunki humein har number ko at most 2 baar allow karna hai (We have set the value of k to 2 because we want to allow each number at most 2 times)
        # for num in nums:  # humne nums ke har element ko check kiya hai (We have checked each element of nums)
        #     if num not in count: # agar num count mein nahi hai toh hum uski frequency ko 0 set karte hain (If num is not in count, we set its frequency to 0)
        #         count[num] = 0  # humne num ki frequency ko 0 set kiya hai (We have set the frequency of num to 0)
        #     if count[num] < k: # agar num ki frequency k se kam hai toh hum usse result mein add karte hain (If the frequency of num is less than k, we add it to the result)
        #         result.append(num) # humne num ko result mein add kiya hai (We have added num to the result)
        #         count[num] += 1 # humne num ki frequency ko 1 se badha diya hai (We have increased the frequency of num by 1)
        # nums[:] = result # humne result ko nums mein copy kiya hai (We have copied the result back to nums)
        # return len(result) # return len(nums) # humne nums ki length return ki hai (We have returned the length of nums)

        # Approach 2:
        '''
        • We use two pointers: one (fast) to scan and one (slow) to overwrite allowed elements.
        • We count duplicates and only allow each element to appear at most twice.
        • If count is within limit, we place it in the right position using the slow pointer.
        Time Complexity: O(n)
        Space Complexity: O(1)
        '''
        # k = 2 # humne k ki value 2 set ki hai kyunki humein har number ko at most 2 baar allow karna hai (We have set the value of k to 2 because we want to allow each number at most 2 times)
        # slow = 0 # humne slow pointer ko 0 se initialize kiya hai (We have initialized the slow pointer to 0)
        # fast = 0 # humne fast pointer ko 0 se initialize kiya hai (We have initialized the fast pointer to 0)
        # count = 0 # humne count ko 0 se initialize kiya hai (We have initialized the count to 0)

        # while fast < len(nums): # humne fast pointer ko nums ki length tak iterate kiya hai (We have iterated the fast pointer until the length of nums)
        #     if fast != 0 and nums[fast] == nums[fast - 1]: # agar fast pointer ka current element pichle element ke barabar hai toh hum count ko 1 se badha dete hain (If the current element of the fast pointer is equal to the previous element, we increase the count by 1)
        #         count += 1 # humne count ko 1 se badha diya hai (We have increased the count by 1)
        #     else: # agar fast pointer ka current element pichle element se alag hai toh hum count ko 1 se reset karte hain (If the current element of the fast pointer is different from the previous element, we reset the count to 1)
        #         count = 1 # humne count ko 1 se reset kiya hai (We have reset the count to 1)
        
        #     if count <= k: # agar count k se kam ya barabar hai toh hum slow pointer ko current fast element se overwrite karte hain (If the count is less than or equal to k, we overwrite the slow pointer with the current fast element)
        #         nums[slow] = nums[fast] # humne slow pointer ko current fast element se overwrite kiya hai (We have overwritten the slow pointer with the current fast element)
        #         slow += 1 # humne slow pointer ko 1 se badha diya hai (We have increased the slow pointer by 1)

        #     fast += 1 # humne fast pointer ko 1 se badha diya hai (We have increased the fast pointer by 1)
        # return slow # return len(nums) # humne nums ki length return ki hai (We have returned the length of nums)
    
        # Approach 3:
        '''
        • Start slow and fast from index k since first k elements are always allowed.
        • Only copy current fast element to slow if it's different from the element k places behind.
        • This ensures each number appears at most k times in the result.
        Time Complexity: O(n)
        Space Complexity: O(1)
        '''
        k = 2 # humne k ki value 2 set ki hai kyunki humein har number ko at most 2 baar allow karna hai (We have set the value of k to 2 because we want to allow each number at most 2 times)
        slow = k # humne slow pointer ko k se initialize kiya hai (We have initialized the slow pointer to k)
        for fast in range(k, len(nums)): # humne fast pointer ko k se nums ki length tak iterate kiya hai (We have iterated the fast pointer from k to the length of nums)
            if nums[fast] != nums[slow - k]: # agar fast pointer ka current element slow pointer ke k places pehle wale element se alag hai toh hum usse slow pointer pe copy karte hain (If the current element of the fast pointer is different from the element k places behind the slow pointer)
                nums[slow] = nums[fast] # humne slow pointer ko current fast element se overwrite kiya hai (We have overwritten the slow pointer with the current fast element)
                slow += 1 # humne slow pointer ko 1 se badha diya hai (We have increased the slow pointer by 1)
        return slow # return len(nums) # humne nums ki length return ki hai (We have returned the length of nums)