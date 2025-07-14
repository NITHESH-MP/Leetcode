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
    public int getDecimalValue(ListNode head) 
    {
        StringBuilder a = new StringBuilder();
        while(head!=null)
        {
            a.append(head.val);
            head = head.next;
        }
        int decimal = Integer.parseInt(a.toString(), 2);
        return decimal;
    }
}