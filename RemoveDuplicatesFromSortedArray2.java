//TC: O(n)
//SC: O(1)
//approach: 2 pointers to track currentIndex of result array, and current index of array iteration,
//  once any value's count exceeds 2, ignore it, and update currentIndex of result array and k only on valid values, and copy current valid values ahead

public class RemoveDuplicatesFromSortedArray2 {
    public int removeDuplicates(int[] nums) {
        int k=1;
        int currentVal=nums[0];
        int currentValCount = 1;
        int currentIndex = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == currentVal){
                if(currentValCount <2){
                    currentValCount++;
                    nums[currentIndex] = nums[i];
                    currentIndex++;
                    k++;
                }
            }else{
                currentVal = nums[i];
                currentValCount = 1;
                nums[currentIndex] = nums[i];
                currentIndex++;
                k++;
            }
        }
        return k;
    }
}
