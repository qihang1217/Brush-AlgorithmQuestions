package qihang.algorithm.sort.bubblesort;

import qihang.algorithm.sort.helper.SortHelper;


public class ImprovedBubbleSort extends SortHelper {
    @Override
    public void solute(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            //某次移动时，发现没有交换任何一个位置，说明后续的已经排序好了，不需要继续排序
            boolean flag = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }
}
