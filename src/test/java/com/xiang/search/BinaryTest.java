package com.xiang.search;

import org.junit.Test;

/**
 * Created by xiangrui on 2019-10-05.
 *
 * @author xiangrui
 * @date 2019-10-05
 */
public class BinaryTest {

    @Test
    public void test_Bi_TC1() {

        String[] strings = {"a", "b", "c", "e", "f", "g", "z"};

        Search biSearch = new Binary();
        int g = biSearch.search(strings, "g");
        System.out.println(g);


    }


}
