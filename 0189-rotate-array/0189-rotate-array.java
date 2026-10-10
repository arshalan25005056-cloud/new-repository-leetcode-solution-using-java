class Solution {
    public void rotate(int[] arr, int k) {
        Queue<Integer> q = new LinkedList<>();
        int n = arr.length;

        if(n==0) return;
         k = k%n;


    int i=0;
 int j=n-1;
while(i<j){
    int temp = arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    i++;
    j--;
}

i=0;
j=k-1;
while(i<j){
    int temp = arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    i++;
    j--;
}
 i=k;
j=n-1;
while(i<j){
    int temp = arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    i++;
    j--;

}

    }
}