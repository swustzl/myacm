package com.myacm.service;

import com.myacm.service.support.ListNode;

import java.util.ArrayList;

/**
 * ��β��ͷ��ӡ����
 * Created by zlovet on 2015/10/26.
 * ����һ��������β��ͷ��ӡ����ÿ���ڵ��ֵ
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
