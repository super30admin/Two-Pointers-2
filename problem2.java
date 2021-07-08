class Solution {
    //time-0(N)
    //space- O(1)
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //nums1 has sufficient space
        
     int aIndex=m-1, bIndex=n-1, p=nums1.length-1;
        
        //3 pointers
        while(aIndex>=0 && bIndex>=0){
            
            //check greater
            if(nums1[aIndex]>= nums2[bIndex]){
                nums1[p--]= nums1[aIndex--];
            }
            else nums1[p--]= nums2[bIndex--];
            
        }
        
        while(bIndex>=0){
            nums1[p--]=nums2[bIndex--];
        }
        
      while(aIndex>=0){
          nums1[p--]=nums1[aIndex--];
      }
/*

[0,2,3,0,0,0] [1,6,7]
[,1,2,3,6,7]
aIndex=0, bIndex=-1
*/
     
    }
}