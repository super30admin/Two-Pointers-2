//80. Remove Duplicates from Sorted Array II
//Time Complexity :O(n) 
//Space Complexity : O(1) 
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

/*Step 1: if length of array is less than 2 means we cannot remove duplicates as no duplicates.
 * Step 2: we will initialize 3 pointers. I to 0th element, j to 1st element and pivot to 0th element of array in starting.
 * Step 3: We will check and run loop while i reaches last element. Will check for j as well.
 * Step 4: Also, if j pointer == j-1 pointer value. Then increment j by 1. After that if j-2th position is greater than 1 means this is the third position we are working on.
 * Step 5: We will now check whether j-1th element is same as j-2th element. If so, allot j-1th element to both 0th and 1st position in an array. And increment pivot by 2.
 * Step 6: if j-2th element is not equal to j-1th element. Then just assign j-1th element to pivot element and increment the pivot by 1. 
 * Step 7: make i=j and then increase the j pointer means looking for next element.
 * 
 */
//output:5

public class removeDuplicateSortArr2 {

	public static int removeDuplicates(int[] nums){
        if(nums.length < 2) return nums.length;
        int i = 0, j=1;
        int pivot = 0;
        while(i < nums.length) {
            while(j < nums.length && nums[j] == nums[j - 1]) {
                j++;
            }
            if(j - 2 >= 0 && nums[j - 1] == nums[j - 2]) {
                nums[pivot] = nums[j - 1];
                nums[pivot + 1] = nums[j - 1];
                pivot += 2;
            }
            else {
                nums[pivot] = nums[j - 1];
                pivot++;
            }
            i = j;
            j++;
        }
        return pivot;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {1,1,1,2,2,3};
		int result=removeDuplicates(num);
		System.out.println(result);
	}

}
