class Problem1:

	def merge(self, nums1, m, nums2, n):

		# Time Complexity : O((m + n)^2)

		# Space complexity : O(1)

		i = 0
		j = 0

		del nums1[m:] 

		while i < len(nums1) and j < n:

			if nums1[i] >= nums2[j]:

				nums1.insert(i, nums2[j])

				i += 1

				j += 1
			else:
				i += 1
		while j < n:
			
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