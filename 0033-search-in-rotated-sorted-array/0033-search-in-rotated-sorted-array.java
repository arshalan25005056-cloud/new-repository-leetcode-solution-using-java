class Solution {
    public int search(int[] arr, int target) {
      
        int n = arr.length;
        int i=0;
        while(i<n)
        {
            if((arr[i]^target)==0)
            {
                return i;
            }
            i++;
        }
        

        return -1;
        
    }
}