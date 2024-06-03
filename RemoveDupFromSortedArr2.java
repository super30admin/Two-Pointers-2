/***
 Using 2 pointers approach
 1. Keep 2 pointers i and j, initially both will point to the index=1
 2. keep incrementing the i pointer and if count of same element <= 2, assign value at index=i to index=j and increment j
 3. If count of same element exceeds 2, keep incrementing i pointer till we get a different element
 4. Once we find the different element, assign that value to index j and continue this process until i reaches n-1
 TC - O(n), SC - O(1)
 */
class RemoveDupFromSortedArr2 {
    public int removeDuplicates(int[] nums) {

        if(nums == null || nums.length == 0)
            return 0;

        int n = nums.length;

        int i =1, j=1;

        int count =1;

        while(i < n) {
            if(nums[i] == nums[i-1])
                count++;
            else
                count=1;

            if(count <= 2)
                nums[j++] = nums[i];

            i++;
        }

        return j;

    }
}