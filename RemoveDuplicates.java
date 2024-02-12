
public class RemoveDuplicates {
	    public static int removeDuplicates(int[] nums) {
	        int slow = 0, fast = 0;
	        int count = 0;
	        while(fast<nums.length){
	            if(slow==0||nums[fast]!=nums[fast-1])
	            count = 1;
	            if(count<=2){
	              nums[slow] = nums[fast];
	              slow++;
	              fast++;
	              count++;
	            }
	            else{
	                fast++;
	              count++;
	            }
	        }
	        return slow;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,1,2,2,3};
		System.out.println(removeDuplicates(nums));

	}

}
