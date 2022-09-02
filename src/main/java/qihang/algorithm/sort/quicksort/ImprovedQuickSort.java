package qihang.algorithm.sort.quicksort;

import qihang.algorithm.sort.helper.SortHelper;

public class ImprovedQuickSort extends SortHelper {

    @Override
    public void solute(int[] nums) {
        innerSolute(nums, 0, nums.length - 1);
    }

    public void innerSolute(int[] nums, int start, int end) {
        if (start < end) {
            int midIndex = midNum(nums, start, end);
            swap(nums, midIndex, start);
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

    public int midNum(int[] nums, int start, int end) {
        int mid = start + (end - start) / 2;
        if (nums[start] < nums[mid]) {
            if (nums[mid] < nums[end]) {
                return mid;
            } else {
                if (nums[start] < nums[end]) {
                    return end;
                } else {
                    return start;
                }
            }
        } else {
            if (nums[end] < nums[mid]) {
                return mid;
            } else {
                if (nums[end] < nums[start]) {
                    return end;
                } else {
                    return start;
                }
            }
        }
    }
}
