package com.xiang.search;

import java.util.Arrays;

/**
 * Created by xiangrui on 2019-09-20.
 *
 * @author xiangrui
 * @date 2019-09-20
 */
public interface Search {

    <T> int search(Comparable<T>[] array, Comparable<T> a);

    default boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    default <T> void sort(T[] array) {
        Arrays.sort(array);
    }

}
