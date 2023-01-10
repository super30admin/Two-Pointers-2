package main

// Time : O(n) : n is the max number of elements in the given array
// Space : O(1)
func removeDuplicates(nums []int) int {
	if len(nums) == 1 {
		return len(nums)
	}
	//slow pointer
	slow := 1
	fast := slow + 1

	for fast < len(nums) {
		if nums[fast] == nums[fast-1] {
			if nums[slow-1] < nums[fast] {
				nums[slow+1] = nums[fast]
				slow++
				continue
			}
			fast++
		} else {
			if nums[fast] > nums[fast-1] {
				nums[slow+1] = nums[fast]
				slow++
				fast++
			}
		}
	}
	return slow + 1
}
