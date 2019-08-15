class Problem2:
	def AtMostTwice1(self, arr):
		# Time Complexity : O(n) where n is the number of elements in the array
		# Space complexity : constant. Not using extra space
		# Passed on leetcode
		i = 2
		while i < len(arr):
			if arr[i] == arr[i - 2]: 
				del arr[i] # delete the element if it is repeated more than twice. Thats why we are checking two elements before
			else:
				i += 1
		return len(arr)

	def AtMostTwice2(self, arr):
		# Time Complexity : O(n) where n is the number of elements in the array
		# Space complexity : constant. Not using extra space
		# Passed on leetcode
		i = 0
		for n in arr:
			if i < 2 or n > arr[i - 2]:
				arr[i] = n # same as the other function but here we use a different loop. No difference
				i += 1
		return i

if __name__ == '__main__':
	amt = Problem2()
	arr = [0, 0, 1, 2, 2, 2, 3, 3]
	print(arr[:amt.AtMostTwice1(arr)])
	arr = [0, 0, 1, 2, 2, 2, 3, 3]
	print(arr[:amt.AtMostTwice2(arr)])