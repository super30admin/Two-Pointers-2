// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
/*
set x, y = m-1, n-1
start from last element of 1st array
if second array empty return
otherwise till first array not empty if nums1[x] has bigger element set ith indx to it and x--
if smaller then set ith index to second array element and y--
*/
package main

func merge(nums1 []int, m int, nums2 []int, n int) {
	x := m - 1
	y := n - 1
	for i:=m+n-1;i>=0;i-- {
		if y < 0 {
			break
		}
		if x >=0 && nums1[x] >= nums2[y] {
			nums1[i] = nums1[x]
			x--
		} else {
			nums1[i] = nums2[y]
			y--
		}
	}
}

func MainMerge() {
	merge([]int {1,2,3,0,0,0},3,[]int {2,5,6},3) //expected [1,2,2,3,5,6]
}
