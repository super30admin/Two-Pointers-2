/*
Problem - Remove Duplicates from Sorted Array II
Approach -used two pointers fast(to scan the elements) and slow(to overwrite elements)
count duplicates and only allow each element to appear at most twice.
If count is within limit, we place it in the right position using the slow pointer.
Time Complexity - O(n)
Space Complexity- O(n)
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int k = 2;
        int slow = 0, fast = 0;

        int count = 0;

        while(fast < nums.length){
            if(fast != 0 && nums[fast] == nums[fast - 1]){
                count++;//duplicate elements increment the count
            }else{
                count = 1; // to indicate its the start of new number
            }
            if(count <= k){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
    public  static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        System.out.println(removeDuplicates.removeDuplicates(new int[]{1,1,1,2,2,3}));
        System.out.println(removeDuplicates.removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3}));

    }
}
