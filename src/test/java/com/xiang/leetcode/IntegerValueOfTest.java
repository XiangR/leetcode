package com.xiang.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;

/**
 * Created by xiangrui on 2019-09-11.
 *
 * @author xiangrui
 * @date 2019-09-11
 */
public class IntegerValueOfTest {

    @Test
    public void test_1() {

        String str = "5643279";

        Assert.assertEquals(Integer.parseInt(str), IntegerValueOf.strToInt(str));
    }

    @Test
    public void test_2() {

        String str = "-215643279";

        Assert.assertEquals(Integer.parseInt(str), IntegerValueOf.strToInt(str));
    }

    @Test
    public void test_3() {

        String str = "+43279";

        Assert.assertEquals(Integer.parseInt(str), IntegerValueOf.strToInt(str));
    }

}
