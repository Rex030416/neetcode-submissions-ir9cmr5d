class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 1. 哨兵节点（Dummy Node）是处理链表的常规操作
        ListNode dummy = new ListNode(0); 
        // 2. cur 指向 dummy 本身，这样 cur.next 就能把 dummy 后面挂上节点
        ListNode cur = dummy; 

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                cur.next = list1; // 链接现有的节点，而不是 new 一个
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next; // 把指针移动到新链接好的末尾
        }

        cur.next = (list1 != null) ? list1 : list2;

        return dummy.next;
    }
}