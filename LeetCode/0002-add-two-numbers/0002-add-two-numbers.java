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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carryover=0;
        ListNode result = new ListNode();
        ListNode temp = result;      
        while (l1!=null || l2!=null ) {
            int val1 = (l1==null?0:l1.val);
            int val2 = (l2==null?0:l2.val);
            int sum = val1 + val2 + carryover;
            carryover = 0;
            if (sum>9){
                carryover = 1; // OR carryover=sum/10;
                sum = sum%10;
            }            
            temp.val = sum;
            if ( (l1!=null && l1.next!=null) || (l2!=null && l2.next!=null)){
                ListNode newNode = new ListNode();
                temp.next = newNode;
                temp = newNode;
            }
            if (l1 != null){l1 = l1.next;}
            if (l2 != null){l2 = l2.next;}
        }
        if (carryover == 1){
            ListNode newNode = new ListNode(1);
                temp.next = newNode;
        }
        return result;
    }
}

