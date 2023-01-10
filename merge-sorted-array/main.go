package main

// Time : O(n) : worst case we traverse for the length of nums1 i.e. m
// Space : O(1)
func merge(nums1 []int, m int, nums2 []int, n int) {

	p1 := m - 1
	p2 := n - 1
	idx := m + n - 1

	for p1 >= 0 && p2 >= 0 {
		// p1 > p2
		if nums1[p1] >= nums2[p2] {
			nums1[idx] = nums1[p1]
			p1--
		} else {
			nums1[idx] = nums2[p2]
			p2--
		}
		idx--
	}
	for p2 >= 0 {
		nums1[idx] = nums2[p2]
		idx--
		p2--
	}

}
