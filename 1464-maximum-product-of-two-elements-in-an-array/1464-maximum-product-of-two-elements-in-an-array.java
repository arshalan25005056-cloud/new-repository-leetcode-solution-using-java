class Solution {
    public int maxProduct(int[] arr) {
int n = arr.length;
int mp=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int p = (arr[i]-1)*(arr[j]-1);
                            if(mp < p){
                                mp=p;
                            }
            }
        }

return mp;
    }
}