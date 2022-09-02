package qihang.algorithm.sort.helper;

import java.util.Arrays;

public abstract class SortHelper extends BaseSortHelper {

    public abstract void solute(int[] nums);

    public void run() {
        long start = System.currentTimeMillis();
        solute(nums);
        long end = System.currentTimeMillis();
        System.out.println("运行时间:");
        System.out.println(end - start);
        System.out.println("交换次数:");
        System.out.println(swapCount);
        if (!Arrays.equals(nums, resNums)) {
            throw new AssertionError();
        } else {
            System.out.println("排序成功！");
        }
    }

    public void swap(int[] nums, int low, int high) {
        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;
        swapCount++;
    }

}
