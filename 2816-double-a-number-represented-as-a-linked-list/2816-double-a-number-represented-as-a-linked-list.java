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
    public ListNode doubleIt(ListNode head) {
        ListNode temp = head;
        Stack<ListNode> stack = new Stack<>();

        while(temp != null){
            stack.push(temp);
            temp = temp.next;
        }

        int carry = 0;

        while(!stack.isEmpty()){
            ListNode node = stack.pop();
            int val = node.val * 2 + carry;

            node.val = val % 10;
            carry = val / 10;
        }

        if(carry > 0){
            ListNode newHead = new ListNode(carry);
            newHead.next = head;
            head = newHead;
        }
        
        return head;
    }
}