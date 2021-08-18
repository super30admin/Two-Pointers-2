class Solution:
	def AtMostTwice2(self, arr):

		i = 0
		for n in arr:
			if i < 2 or n > arr[i - 2]:

				arr[i] = n 

				i += 1
		return i

if __name__ == '__main__':

	amt = Solution()

	arr = [0, 0, 1, 2, 2, 2, 3, 3]

	print(arr[:amt.AtMostTwice2(arr)])


		
# TC : O(n)
# SC: O(1)