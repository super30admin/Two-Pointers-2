class Problem1:
	def merge(self, nums1, m, nums2, n):
		# Time Complexity : O((m + n)^2)
		# Space complexity : constant. Not using extra space
		# Passed on leetcode
		i = 0
		j = 0
		del nums1[m:] # In python arrays dynamic length so we don't need the extra zeroes that are present to accomodate nums2 array in this algorithm
		while i < len(nums1) and j < n:
			# Have two pointers one pointing to nums1 array and other pointing it to nums2 array
			# compare both the elements being pointed by two pointers and place them in the correct position in nums1 array
			if nums1[i] >= nums2[j]:
				nums1.insert(i, nums2[j])
				i += 1
				j += 1
			else:
				i += 1
		while j < n:
			# when there are more elements present in nums2 array which are greater than the greatest element of nums1 array, just append them to nums1 array
			nums1.append(nums2[j])
			j += 1

if __name__ == '__main__':
	nums1 = [1,2,3,0,0,0]
	m = 3
	nums2 = [-1,2,3]
	n = 3
	mer = Problem1()
	mer.merge(nums1, m, nums2, n)
	print(nums1)