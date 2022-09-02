package qihang.algorithm.sort.bubblesort;

import qihang.algorithm.sort.helper.SortHelper;

public class ImprovedBubbleSort1 extends SortHelper {

    @Override
    @Deprecated
    public void solute(int[] nums) {
        //存在错误
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            //某次移动时，发现没有交换任何一个位置，说明后续的已经排序好了，不需要继续排序
            int lastPos = -1;
            for (int j = 0; j < n - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                    lastPos = j + 2;
                }
            }
            if (lastPos == -1) {
                break;
            }
            n = lastPos;
        }
    }

}
