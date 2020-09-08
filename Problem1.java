
public class Problem1 {

	
	  //Time:O(n);
	//space :O(1);
	  public int removeDuplicates(int[] nums) {
	        int prev=0;
	        int curr=1;
	        int i=1;
	        boolean flag = true;
	       while(curr<nums.length){
	            if(nums[prev]==nums[curr]){
	                if(flag){
	                    nums[i]=nums[curr];
	                    i++;
	                    curr++;
	                    flag=false;
	                }else{
	                    curr++;
	                }
	            }
	           else{
	               prev=curr;
	               nums[i]=nums[curr];
	               i++;
	               curr++;
	               flag=true;
	           }
	        }
	        
	        return i;
	    }
}
