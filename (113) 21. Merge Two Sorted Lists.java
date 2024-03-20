/* URL : https://leetcode.com/problems/merge-two-sorted-lists/description/ */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }
        ListNode adder;
        ListNode head;
        if(list1.val < list2.val) {
            adder = list1;
            list1 = list1.next;
        } else {
            adder = list2;
            list2 = list2.next;
        }
        head = adder;
        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                adder.next = list1;
                adder = adder.next;
                list1 = list1.next;
            } else {
                adder.next = list2;
                adder = adder.next;
                list2 = list2.next;
            }
        }
        if (list1 != null) {
            adder.next = list1;
        }
        if (list2 != null) {
            adder.next = list2;
        }
        return head;
    }
}
