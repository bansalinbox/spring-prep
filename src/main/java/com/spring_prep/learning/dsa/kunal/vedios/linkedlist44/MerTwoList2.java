package com.spring_prep.learning.dsa.kunal.vedios.linkedlist44;

import com.spring_prep.learning.dsa.kunal.vedios.linkedlist43.LL;

import java.util.LinkedList;

public class MerTwoList2 {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList();
        list1.add(1);
        list1.add(2);
        list1.add(4);

        LinkedList<Integer> list2 = new LinkedList();
        list2.add(1);
        list2.add(3);
        list2.add(4);

//        mergeTwoLists(list1, list2);


    }

    public static LL.Node mergeTwoLists(LL.Node list1, LL.Node list2) {
        LL.Node temp1 = list1;
        LL.Node temp1pre = null;

        LL.Node temp2 = list2;
        while(temp1!= null && temp2 != null){
            if(temp1.value <= temp2.value){
                temp1pre = temp1;
                temp1 = temp1.next;
            }else{
                temp1pre.next = temp2;
                temp2.next = temp1;
                temp2 = temp2.next;
            }
        }
        while(temp2 != null){
            temp1pre.next = temp2;
            temp2 = temp2.next;
        }
        return list1;
    }
}
