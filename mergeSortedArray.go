// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

/*

Approach:
We use the 2 pointer pattern, but with 3 pointers. Each pointer points to the
end of the 3 arrays - nums1, nums2, and the end of the empty part of nums 1.
We populate the nums1 array from the end as we always know that the last
element of both arrays are the largest in those respective arrays, so we can
just keep comparing whichever is the highest and placing them directly in the
end of nums1.

*/

package main

func merge(nums1 []int, m int, nums2 []int, n int) {
	if len(nums1) == 0 || len(nums2) == 0 {
		return
	}

	p1, p2, p3 := m-1, n-1, m+n-1

	for ; p1 >= 0 && p2 >= 0; p3-- {
		if nums1[p1] > nums2[p2] {
			nums1[p3] = nums1[p1]
			p1--
		} else {
			nums1[p3] = nums2[p2]
			p2--
		}
	}

	for ; p1 >= 0; p1-- {
		nums1[p3] = nums1[p1]
		p3--
	}

	for ; p2 >= 0; p2-- {
		nums1[p3] = nums2[p2]
		p3--
	}
}
