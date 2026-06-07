class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k= 0 , i = 0, j = 0;
        int[] nums3 = new int[m+n];
        while(i<m && j< n){
            if(nums1[i] < nums2[j]){
                nums3[k] = nums1[i];
                i++;
                k++;
            }
            else{
                nums3[k] = nums2[j];
                j++;
                k++;
            }
        }
        while(i<m){
            nums3[k] = nums1[i];
            i++;
            k++;
        }
        while(j<n){
            nums3[k] = nums2[j];
            j++;
            k++;
        }
        for(k=0; k<nums3.length ; k++){
            nums1[k] = nums3[k];
        }
    }
}