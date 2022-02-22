/*
Time Complexity: O(n)
Space Complexity: O(1)
Code run on leetcode: yes
Any difficulties : no
Approach:
1. Keeping count of the frequency of every element of the array
2. when the freq is less than or equals to 2 we can update our resultant array and return the size of the resultant array
 */
public class RemoveDuplicatedFromSortedArrayII {
    public static int removeDuplicationSortedArray(int[] nums){
        int resultIndex = 1;
        int freq = 1;

        for(int i =1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                freq++;
            }else{
                freq = 1;
            }
            if(freq<=2){
                nums[resultIndex] = nums[i];
                resultIndex++;
            }
        }
        return resultIndex;
    }

    public static void main(String[] args){
        int[] nums = {1,1,1,2,2,3};
        System.out.println("remove duplicates: "+ removeDuplicationSortedArray(nums));
    }
}
