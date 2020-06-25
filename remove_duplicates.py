class Solution:
	def removeDuplicates(self, nums: List[int]) -> int:
		if len(nums)<2:
			return len(nums)
		j = 1
		count = 1
		for i in range(1,len(nums)):
			if nums[i]==nums[i-1]:
				count+=1
			else:
				count=1
			if count<3:
				nums[j]=nums[i]
				j+=1
		nums = nums[:j]
		return len(nums)

#time complexity - O(n), n is the size of input array

#space complexity - O(1), no auxillary data structure used

#all test cases passed