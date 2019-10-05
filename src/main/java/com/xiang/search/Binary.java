package com.xiang.search;

import java.util.Objects;

/**
 * Created by xiangrui on 2019-10-05.
 *
 * @author xiangrui
 * @date 2019-10-05
 */
public class Binary implements Search {

    @Override
    public <T> int search(Comparable<T>[] array, Comparable<T> a) {

        // 绝对排序
        sort(array);

        int left = 0;
        int right = array.length - 1;

        int mid;
        while (left <= right) {

            mid = (left + right) / 2;

            if (Objects.equals(array[mid], a)) {
                // 当前位置
                return mid + 1;
            } else if (less(array[mid], a)) {
                // 左边抛弃
                left = mid + 1;
            } else {
                // 右边抛弃
                right = mid - 1;
            }
        }

        throw new IllegalArgumentException("no element in array");
    }

}
