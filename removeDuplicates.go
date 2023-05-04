// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

/*

Approach:
We use the 2 pointer pattern for this problem. Since we're told that we have to
sort the array in place such that the first K elements are in sorted order with
each element occurring <= twice. For this, the first pointer will traverse
normally in the array, but the second pointer will keep track of the running
index of the last of the solution array, such that each element ultimately
doesn't have more than two occurrences.

*/

package main

func removeDuplicates(nums []int) int {
	if len(nums) <= 1 {
		return len(nums)
	}

	j := 1 // start at second position
	counter := 1
	for i := 1; i < len(nums); i++ {
		if nums[i] == nums[i-1] {
			counter++
		} else {
			counter = 1
		}
		if counter <= 2 {
			nums[j] = nums[i]
			j++
		}
	}

	return j
}
