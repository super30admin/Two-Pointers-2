class MergeSortedArray {
    //Complexity time : O(m+n);
    // space : O(1)
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m-1;
        int p2 = n-1;
        int r = m+n-1;

        while(p1>=0 || p2>=0){

            if(p1<0){
                nums1[r--] = nums2[p2--]; 

            }else if(p2<0){
                return;
            }
            else if(nums1[p1]>nums2[p2]){
                nums1[r--] = nums1[p1--];
            }else{
                nums1[r--] = nums2[p2--];    
            }
        }
        return;
    }
}