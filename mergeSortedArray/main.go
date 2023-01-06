package main

/*
approach 1
    merge them blindly
    and then sort at the end
    time: o(m+nlogm+n)
    space: o(1)

approach 2
    create another array of size m+n
    and use 2 pointers and start pushing items from n1 and n2 in asc order
    time : o(m+n)
    space: o(m+n)

approach 3
    using three pointers, fill out the nums1 array in desc order ( from right to left )

*/

func merge(nums1 []int, m int, nums2 []int, n int) {
	last := len(nums1) - 1
	n1 := m - 1
	n2 := n - 1

	for last >= 0 {
		if n1 >= 0 && n2 >= 0 {
			n1Val := nums1[n1]
			n2Val := nums2[n2]
			if n1Val > n2Val {
				nums1[last] = n1Val
				n1--
			} else {
				nums1[last] = n2Val
				n2--
			}
		} else if n2 >= 0 {
			nums1[last] = nums2[n2]
			n2--
		}
		last--
	}
}
