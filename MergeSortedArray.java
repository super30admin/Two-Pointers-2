public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int first=m-1;
        int second=n-1;
        int index=m+n-1;
        while(first>=0 && second>=0){
            if(nums1[first]>nums2[second]){
                nums1[index]=nums1[first];
                first--;
            }
              else{
                  nums1[index]=nums2[second];
                  second--;
              }
            index--;
        }
        while(second>=0){
            nums1[index]=nums2[second];
            second--;
            index--;
        }

    }
    public static void main(String args[]){
        MergeSortedArray obj=new MergeSortedArray();
        int []nums1={1,2,3,0,0,0};
        int m=3;
        int nums2[]={2,5,6};
        int n=3;
    obj.merge(nums1, m, nums2, n);
    }
}
