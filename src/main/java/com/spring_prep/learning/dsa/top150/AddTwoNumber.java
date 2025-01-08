package com.spring_prep.learning.dsa.top150;

import com.spring_prep.learning.dsa.kunal.vedios.Run;

public class AddTwoNumber {

    public static void main(String[] args) {

        String name = "gourav";
        name = name.substring(1);
        System.out.println(isSubsequence("axc", "ahbgdc"));

//        ListNode l1 = new ListNode(9);
//        l1.next = new ListNode(9);
//        l1.next.next = new ListNode(9);
//        l1.next.next.next = new ListNode(9);
//        l1.next.next.next.next = new ListNode(9);
//
//
//        ListNode l2 = new ListNode(9);
//        l2.next = new ListNode(9);
//        l2.next.next = new ListNode(9);
//
//        ListNode ans = addTwoNumbers(l1, l2);
//        System.out.println(ans);
//        while(ans !=  null){
//            System.out.print(ans.val + " -->");
//            ans = ans.next;
//        }
    }

    public static boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        while(i < s.length() && j < t.length()){
            System.out.println(s + " <------> " + t);
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
                s = s.substring(i);
                t = t.substring(j);
            }else{
                j = j+1;
                t = t.substring(j);
            }
        }
        if(s.length() > 0){
            return false;
        }
        return true;
    }




    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry =0;
        ListNode head = new ListNode(0);
        ListNode dummy = head;
        while(l1 != null && l2 != null){
            int val2 = l2.val;
            int val1 = l1.val;


            int sum = val1 + val2 + carry;

            int mod = sum % 10;
            carry = sum / 10;

            ListNode node = new ListNode(mod);
            dummy.next = node;
            dummy = node;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null){
            int val1 = l1.val;
            int sum = val1 + carry;

            int mod = sum % 10;
            carry = sum / 10;
            ListNode node = new ListNode(mod);
            dummy.next = node;
            dummy = node;
            l1 = l1.next;
        }

        while(l2 != null){
            int val2 = l2.val;
            int sum = val2 + carry;

            int mod = sum % 10;
            carry = sum / 10;
            ListNode node = new ListNode(mod);
            dummy.next = node;
            dummy = node;
            l2 = l2.next;
        }
        if(carry != 0){
            ListNode node = new ListNode(carry);
            dummy.next = node;
            dummy = node;
        }
        return head.next;
    }



    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
