package com.xiang.leetcode;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiangrui on 2019-09-11.
 *
 * @author xiangrui
 * @date 2019-09-11
 */
public class AddTwoNumbers {

    private static int[] number = new int[]{1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    public  ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        BigDecimal value1 = toValue(l1);
        BigDecimal value2 = toValue(l2);

        BigDecimal multiply = value1.add(value2);
        return toNode(multiply);
    }

    private  ListNode toNode(BigDecimal val) {

        String format = String.valueOf(val);
        char[] chars = format.toCharArray();

        int[] reverse = reverse(chars);

        //数组转换成链表
        ListNode root = new ListNode(reverse[0]);//生成链表的根节点，并将数组的第一个元素的值赋给链表的根节点
        ListNode other = root;//生成另一个节点，并让other指向root节点，other在此作为一个临时变量，相当于指针
        for (int i = 1; i < reverse.length; i++) {//由于已给root赋值，所以i从1开始
            ListNode temp = new ListNode(reverse[i]);//每循环一次生成一个新的节点,并给当前节点赋值
            other.next = temp;//将other的下一个节点指向生成的新的节点
            other = temp;//将other指向最后一个节点(other的下一个节点)  other=other.getNext();
        }
        return root;
    }

    private  int[] reverse(char[] chars) {
        int length = chars.length;
        int[] chars1 = new int[length];
        for (int i = 0; i < length; i++) {
            int i1 = Integer.parseInt(String.valueOf(chars[i]));
            chars1[length - i - 1] = i1;
        }
        return chars1;
    }

    private  BigDecimal toValue(ListNode l1) {
        List<Integer> list = new ArrayList<>();
        if (l1 == null) {
            return BigDecimal.ZERO;
        }
        list.add(l1.val);
        ListNode next = l1.next;
        while (next != null) {
            list.add(next.val);
            next = next.next;
        }
        BigDecimal result = BigDecimal.ZERO;
        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            BigDecimal bigDecimal = BigDecimal.valueOf((long) integer * number[i]);
            result = result.add(bigDecimal);
        }
        return result;
    }

    public static class ListNode {

        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }

}
