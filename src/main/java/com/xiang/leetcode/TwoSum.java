package com.xiang.leetcode;

import com.alibaba.fastjson.JSON;

/**
 * Created by xiangrui on 2019-09-11.
 *
 * @author xiangrui
 * @date 2019-09-11
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int first;
        int second;
        for (int i = 0; i < nums.length; i++) {
            first = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                second = nums[j];
                if (first + second == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{2, 11, 15, 7};
        int target = 9;

        int[] ints = twoSum(nums, target);

        System.out.println(JSON.toJSON(ints));
    }
}
