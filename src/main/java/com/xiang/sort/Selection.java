package com.xiang.sort;

/**
 * Created by xiangrui on 2019-09-20.
 *
 * @author xiangrui
 * @date 2019-09-20
 */
public class Selection implements Sort {

    @Override
    public <T> void sort(Comparable<T>[] a) {
        int length = a.length;
        for (int i = 0; i < length; i++) {
            int min = i;

            // 从第一个开始，找到比当前最小的，然后交换位置
            for (int j = i + 1; j < length; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exchange(a, i, min);
        }
    }
}
