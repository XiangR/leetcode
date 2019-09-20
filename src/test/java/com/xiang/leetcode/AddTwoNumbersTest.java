package com.xiang.leetcode;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiangrui on 2019-09-11.
 *
 * @author xiangrui
 * @date 2019-09-11
 */
public class AddTwoNumbersTest {


    @Test
    public void test_1() {

        AddTwoNumbers numbers = new AddTwoNumbers();

        AddTwoNumbers.ListNode node1 = new AddTwoNumbers.ListNode(2);
        AddTwoNumbers.ListNode node2 = new AddTwoNumbers.ListNode(4);
        AddTwoNumbers.ListNode node3 = new AddTwoNumbers.ListNode(3);
        node1.next = node2;
        node2.next = node3;

        AddTwoNumbers.ListNode node_1 = new AddTwoNumbers.ListNode(5);
        AddTwoNumbers.ListNode node_2 = new AddTwoNumbers.ListNode(6);
        AddTwoNumbers.ListNode node_3 = new AddTwoNumbers.ListNode(4);
        node_1.next = node_2;
        node_2.next = node_3;

        AddTwoNumbers.ListNode node = numbers.addTwoNumbers(node1, node_1);

        System.out.println(node.val);
        System.out.println(node.next.val);
        System.out.println(node.next.next.val);

    }


    @Test
    public void test_3() {

        AddTwoNumbers numbers = new AddTwoNumbers();

        AddTwoNumbers.ListNode node1 = new AddTwoNumbers.ListNode(2);
        AddTwoNumbers.ListNode node2 = new AddTwoNumbers.ListNode(4);
        node1.next = node2;

        AddTwoNumbers.ListNode node_1 = new AddTwoNumbers.ListNode(5);
        AddTwoNumbers.ListNode node_2 = new AddTwoNumbers.ListNode(6);
        AddTwoNumbers.ListNode node_3 = new AddTwoNumbers.ListNode(4);
        node_1.next = node_2;
        node_2.next = node_3;

        AddTwoNumbers.ListNode node = numbers.addTwoNumbers(node1, node_1);

        System.out.println(node.val);
        System.out.println(node.next.val);
        System.out.println(node.next.next.val);

    }


}
