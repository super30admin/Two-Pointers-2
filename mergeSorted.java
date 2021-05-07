// Time Complexity : O(m+n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

public class mergeSorted {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int pointer1= m-1;
        int pointer2= n-1;
        
        for(int main_pointer=m+n-1;main_pointer>=0;main_pointer--){
            
            if(pointer2<0)
                break;
            
            if(pointer1>=0 && nums1[pointer1]>nums2[pointer2]){
                nums1[main_pointer]=nums1[pointer1];
                pointer1--;
                
            }else{                
                nums1[main_pointer]=nums2[pointer2];
                pointer2--;
            }             
        }
    }
    
}
