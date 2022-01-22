//if putting the elements in the existing array and just sorting the values
//TC: O(nlog n);
//SC: O(N)

//TC: O(N); when not sorting and checking each value individually and putting from the end using two pointer approach;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        if(nums1==null || nums1.length==0){
            return;
        }
        
        int ptr1=m-1;
        int ptr2=n-1;
        int i=nums1.length-1;
        
        //ptr1 and ptr2 should have && condition, such that neither ptr1 and ptr2 neither should be going negative;
        while(ptr1>=0 && ptr2>=0){
            if(nums1[ptr1]>nums2[ptr2]){
                nums1[i]=nums1[ptr1];
                i--;
                ptr1--;
            }else{
                nums1[i]=nums2[ptr2];
                i--;
                ptr2--;
            }
        }
        
        //Since i and ptr1,2 are getting updated anyways, one can directly access them and update their value in num1;
         while(ptr2>=0){
                    nums1[i]=nums2[ptr2];
                    i--;
                    ptr2--;
         }
        
        
//         int j=0;
//         for(int i=m;i<nums1.length;i++){
//             nums1[i]=nums2[j];
//             j++;
//         }
//         Arrays.sort(nums1);
        
        
    }
}
