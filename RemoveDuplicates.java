// Time complexity = O(n)
// Space complexity = variable. worst can be O(n)
// what we did-
// take 2 pointers (fast and slow)
// fast will iterate over the entire array and will find the duplicates.
// slow will be the answer. the limiting factor. so at most 2 can be of a single number
// slow will move at most by 2 for each number.
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int count=1;// the first number is already new right.
        int slow =1;// ans.
        int k=2; // how mant at most times do you want to repeat the number.
        for(int i=1;i< nums.length;i++) {
            if(nums[i] == nums[i-1]) {
                count++;
            }else {// it is not the same numbers.
                count=1;
            }
            
            if(count<= k) {
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;
        
    }
}