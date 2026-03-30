class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 1. 创建虚拟头节点，指向 head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode slow = dummy;
        ListNode fast = dummy;

        // 2. fast 先走 n 步
        // 此时 fast 和 slow 之间间隔了 n 个节点
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // 3. 同时移动，直到 fast 走到最后一个节点
        // 此时 slow 刚好停在“待删除节点”的前一个位置
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // 4. 跳过待删除节点
        slow.next = slow.next.next;

        // 5. 注意：必须返回 dummy.next，因为 head 可能已经被删除了
        return dummy.next;
    }
}