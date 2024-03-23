/* URL : https://leetcode.com/problems/intersection-of-two-linked-lists/description/ */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // first find the length of both lists
        int l1 = 0;
        int l2 = 0;
        ListNode a = headA;
        ListNode b = headB;
        while(a != null) {
            a = a.next;
            l1++;
        }
        while(b != null) {
            b = b.next;
            l2++;
        }
        int diff = Math.abs(l1 - l2);
        ListNode iteratorA = headA;
        ListNode iteratorB = headB;
        if(l1 > l2) {
            while(diff != 0) {
                iteratorA = iteratorA.next;
                diff--;
            }
        } else {
            while(diff != 0) {
                iteratorB = iteratorB.next;
                diff--;
            }
        }
        while(iteratorA != iteratorB) {
            iteratorA = iteratorA.next;
            iteratorB = iteratorB.next;
        }
        return iteratorA;
    }
}
