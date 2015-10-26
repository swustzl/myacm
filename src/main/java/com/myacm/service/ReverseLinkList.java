package com.myacm.service;

import com.myacm.service.support.ListNode;

import java.util.ArrayList;

/**
 * 从尾到头打印链表
 * Created by zlovet on 2015/10/26.
 * 输入一个链表，从尾到头打印链表每个节点的值
 */
public class ReverseLinkList {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        while(listNode!=null){
            al.add(0,listNode.val);
            listNode = listNode.next;
        }
        return al;
    }
}
