package week1;

import java.util.HashMap;
import java.util.Map;

/**
 * Day01 两数之和
 * 题目：给定整数数组 nums 和目标值 target，返回两个数的下标，使它们相加为 target。
 * 思路：哈希表一次遍历，边存边查，时间 O(n)，空间 O(n)。
 */
public class Day01TwoSum {

    // 解法1：哈希表
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    // 简单测试
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ans = twoSum(nums, target);
        System.out.println("下标：" + ans[0] + " " + ans[1]);
    }
}