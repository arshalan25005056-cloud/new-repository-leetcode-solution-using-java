class Solution {
    public List<List<Integer>> threeSum(int[] arr) {

        List<List<Integer>> ans = new ArrayList<>();

        int n = arr.length;

        Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {

            // Duplicate i ko skip karo
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {

                    List<Integer> a = new ArrayList<>();

                    a.add(arr[i]);
                    a.add(arr[left]);
                    a.add(arr[right]);

                    ans.add(a);

                    left++;
                    right--;

                    // Duplicate left values skip
                    while (left < right && arr[left] == arr[left - 1]) {
                        left++;
                    }

                    // Duplicate right values skip
                    while (left < right && arr[right] == arr[right + 1]) {
                        right--;
                    }

                } else if (sum < 0) {

                    left++;

                } else {

                    right--;
                }
            }
        }

        return ans;
    }
}