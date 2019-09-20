package com.xiang.sort;


import com.alibaba.fastjson.JSON;
import org.junit.Test;

/**
 * Created by xiangrui on 2019-09-20.
 *
 * @author xiangrui
 * @date 2019-09-20
 */
public class SelectionTest {


    @Test
    public void test_Insertion_TC1() {

        String[] strings = {"a", "z", "c", "b", "f", "g", "e"};
        Sort sort = new Selection();
        sort.sort(strings);

        System.out.println(sort.isSorted(strings));
        System.out.println(JSON.toJSON(strings));
    }


}
