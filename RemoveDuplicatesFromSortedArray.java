package s30Coding;

//Time Complexity :- O(n) since we traverse each element in the array on
// Space Complexity :- O(1) No extra space used

//Leet Code :- yes

// Logic :- We just override the duplicates elements with its next element in the array


public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int j = 1, count  = 1;
        for(int i  = 1; i< nums.length; i++){
            if(nums[i] == nums[i-1]){
                count++;
            }
            else{
                count = 1;
            }
            if(count <=2){
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}
