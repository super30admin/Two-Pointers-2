// Time Complexity : O(N) - n length of array
// Space Complexity : O(1) - constant space
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

//We use two pointers: j - index where value needs to be inserted, i - cur index while traversing array
//We keep a count to check atmost 2 duplicates of each element is present
//If count<=2, we keep the value as it is and increment j. If count>2, j will be the index where a new element is to be inserted.
//So, we just increment i. 
//When a new element is found, count is reset to 1. 

public class RemoveDuplicates {
    
    public static int removeDuplicates(int[] nums){

        int j = 1, count = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                count++;
            }else{
                count = 1;
            }

            if(count <= 2){
                nums[j++] = nums[i];
            }
        }

        return j;
    }


    public static void main(String[] args){
        int[] nums = {1,1,1,2,2,3,4,4,4};
        int len = removeDuplicates(nums);
        for(int i = 0; i < len; i++){
            System.out.print(nums[i]+" ");
        }
    }
}
