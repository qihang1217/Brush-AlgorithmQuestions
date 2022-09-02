package qihang.algorithm.sort.bubblesort;

import qihang.algorithm.sort.helper.SortHelper;

public class BubbleSort extends SortHelper {
    @Override
    public void solute(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                }
            }
        }
    }
}
