class Solution {
    public int getCommon(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
int res = -1;
        int i=0,j=0;
        while(i<m && j<n){
            if(arr1[i]==arr2[j]){
                    res = arr1[i];
                    break;
            }else if(arr1[i]>arr2[j]){
                j++;
            }else{
                i++;
            }
        }

        return res;
    }
}