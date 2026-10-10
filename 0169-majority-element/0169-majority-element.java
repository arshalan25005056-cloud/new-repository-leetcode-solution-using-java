
import java.util.Arrays;

class Solution {
    public int majorityElement(int[] arr) {
        Arrays.sort(arr);

        int n = arr.length;
        int maxfreq = 0;
        int f = 1;
        int ans = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                f++;
            } else {
                f = 1;
            }

            if (f > maxfreq) {
                maxfreq = f;
                ans = arr[i];
            }
        }

        return ans;
    }
}
