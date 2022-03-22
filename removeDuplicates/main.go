package main

// time: o(n)
// space: o(1)
func removeDuplicates(nums []int) int {

	if nums == nil || len(nums) == 0 {
		return 0
	}
	if len(nums) == 1 {
		return 1
	}

	count := 1
	nextUniqIdx := 1
	for i := 1; i < len(nums); i++ {

		if nums[i] == nums[i-1] {
			count++
		} else {
			count = 1
		}
		if count <= 2 {
			nums[nextUniqIdx] = nums[i]
			nextUniqIdx++
		}
	}

	return nextUniqIdx
}
