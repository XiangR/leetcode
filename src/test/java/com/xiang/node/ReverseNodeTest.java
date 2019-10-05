package com.xiang.node;

import org.junit.Test;

/**
 * Created by xiangrui on 2019-09-20.
 *
 * @author xiangrui
 * @date 2019-09-20
 */
public class ReverseNodeTest {

    @Test
    public void test_1() {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        new ReverseNode().reverse(a);
        while (e != null) {
            System.out.println(e.value);
            e = e.next;
        }
    }

    @Test
    public void test_2() {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        new ReverseNode().reverse2(a);
        while (e != null) {
            System.out.println(e.value);
            e = e.next;
        }
    }
}
