package qihang.algorithm.sort.InsertionSort;

import qihang.algorithm.sort.helper.SortHelper;

public class InsertionSort extends SortHelper {


    @Override
    public void solute(int[] nums) {
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            if (nums[i] < nums[i - 1]) {
                int j;
                int target = nums[i];
                for (j = i - 1; j >= 0 && nums[j] > target; j--) {
                    nums[j + 1] = nums[j];
                }
                nums[j + 1] = target;
            }
        }
    }
}
