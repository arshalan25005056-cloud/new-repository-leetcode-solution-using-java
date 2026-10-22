
import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        create(nums, 0, temp, ans);

        return ans;
    }

    void create(int[] nums, int index,
                List<Integer> temp,
                List<List<Integer>> ans) {

        if (index == nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        
        temp.add(nums[index]);
        create(nums, index + 1, temp, ans);

  
        temp.remove(temp.size() - 1);
        create(nums, index + 1, temp, ans);
    }
}
