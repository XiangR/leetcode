package com.xiang.sort;

/**
 * Created by xiangrui on 2019-09-20.
 *
 * @author xiangrui
 * @date 2019-09-20
 */
public class Insertion implements Sort {

    @Override
    public <T> void sort(Comparable<T>[] a) {
        int length = a.length;
        for (int i = 0; i < length; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exchange(a, j, j - 1);
            }
        }
    }
}
