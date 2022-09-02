package qihang.algorithm.sort.quicksort;

import qihang.algorithm.sort.helper.SortHelper;

public class QuickSort extends SortHelper {

    @Override
    public void solute(int[] nums) {
        innerSolute(nums, 0, nums.length - 1);
    }

    public void innerSolute(int[] nums, int start, int end) {
        if (start < end) {
            int stand = nums[start];
            int low = start;
            int high = end;
            while (low < high) {
                while (low < high && nums[high] >= stand) {
                    high--;
                }
                while (low < high && nums[low] <= stand) {
                    low++;
                }
                swap(nums, low, high);
            }
            swap(nums, start, low);
            innerSolute(nums, start, low - 1);
            innerSolute(nums, low + 1, end);
        }
    }

}
