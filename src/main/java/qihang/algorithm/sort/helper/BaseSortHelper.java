package qihang.algorithm.sort.helper;


import java.util.Arrays;
import java.util.Random;

public class BaseSortHelper {
    public static int[] nums;
    public static int[] resNums;
    public static int swapCount;

    static {
        Random random = new Random();
        int sum = 10000;
        nums = new int[sum];
        for (int i = 0; i < sum; i++) {
            nums[i] = random.nextInt();
        }

        int[] temp = Arrays.copyOf(nums, nums.length);
        Arrays.sort(temp);
        resNums = Arrays.copyOf(temp, temp.length);
    }
}
