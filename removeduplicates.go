// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
/*
set m,r,count =0, set prev = -9999
till r< nums m
if r is not first element if prev == element at r if more than 1 present just increment count and r
if just 0 or 1 present if there is a gap between m and r fill that gap by setting value of m as r element, increment all
if prev not same then set prev as current if count > 1 set m as r and increment all set count to 1
if count 0 or 1 fill gap and increment all set count to 1
*/
package main

import "fmt"

func removeDuplicates(nums []int) int {
	fmt.Println(nums)
	m, r := 0, 0
	count := 0
	prev := -9999
	for r < len(nums) {
		if r > 0 {
			if prev == nums[r] {
				if count > 1 {
					count++
					r++
				} else {
					if r - m > 0 {
						nums[m] = nums[r]
					}
					m++
					r++
					count++
				}
			} else {
				prev = nums[r]
				if count > 1 {
					nums[m] = nums[r]
					m++
					r++
					count = 1
				} else {
					if r - m > 0 {
						nums[m] = nums[r]
					}
					m++
					r++
					count = 1
				}
			}
		} else {
			prev = nums[r]
			m++
			r++
			count++
		}
	}
	fmt.Println(nums)
	return m
}

func MainRemoveDuplicate() {
	removeDuplicates([]int {1,1,1,2,3}) //expected [1,1,2,3]
}
