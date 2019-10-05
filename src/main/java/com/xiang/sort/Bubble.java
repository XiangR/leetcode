package com.xiang.sort;

/**
 * Created by xiangrui on 2019-09-20.
 *
 * @author xiangrui
 * @date 2019-09-20
 */
public class Bubble implements Sort {

    @Override
    public <T> void sort(Comparable<T>[] a) {
        int length = a.length;

        // 轮训 length 次
        for (int i = 0; i < length; i++) {

            // 每次轮训的数量从数据尾部，依次递减，且轮训过程中将小的数据前移
            for (int j = 1; j < length - i; j++) {
                if (less(a[j], a[j - 1])) {
                    exchange(a, j, j - 1);
                }
            }
        }

    }
}
