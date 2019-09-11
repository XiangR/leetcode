package com.xiang.leetcode;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

/**
 * Created by xiangrui on 2019-09-11.
 *
 * @author xiangrui
 * @date 2019-09-11
 */
public class TwoSumTest {


    @Test
    public void test_1() {

        int[] nums = new int[]{2, 11, 15, 7};
        int target = 9;

        int[] ints = TwoSum.twoSum(nums, target);

        System.out.println(JSON.toJSON(ints));

    }

    @Test
    public void test_2() {

        int[] nums = new int[]{2, 11, 15, 7};
        int target = 9;

        int[] ints = TwoSum.twoSum2(nums, target);

        System.out.println(JSON.toJSON(ints));

    }
}
