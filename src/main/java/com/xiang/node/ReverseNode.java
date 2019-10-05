package com.xiang.node;

/**
 * Created by xiangrui on 2019-09-20.
 *
 * @author xiangrui
 * @date 2019-09-20
 */
public class ReverseNode {

    public Node reverse(Node head) {
        if (head == null || head.next == null)
            return head;
        Node temp = head.next;
        Node newHead = reverse(head.next);
        temp.next = head;
        head.next = null;
        return newHead;
    }

    public Node reverse2(Node head) {

        Node next = null;
        Node prev = null;
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
