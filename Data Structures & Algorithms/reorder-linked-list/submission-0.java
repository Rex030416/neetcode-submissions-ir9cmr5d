/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        ListNode cur=head;
        ListNode tail=head;
        while(tail.next!=null&&tail.next.next!=null){
            tail=tail.next.next;
            cur=cur.next;
        }
        ListNode secondStart=cur.next;
        cur.next=null;
        ListNode reverseHead=reverse(secondStart);
        ListNode dummy=new ListNode(0);
        cur=dummy.next;
        ListNode cur1=head,cur2=reverseHead;
        while(cur2!=null){
            ListNode tmp1 = cur1.next;
            ListNode tmp2 = cur2.next;

            cur1.next = cur2;    
            cur2.next = tmp1;   

            cur1 = tmp1;       
            cur2 = tmp2;
        }
    
        return;
        

    }

    private ListNode reverse(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode prev=null;
        ListNode cur=head;
        while(cur!=null){
            ListNode tmp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=tmp;
        }
        return prev;
    }

    
}
