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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;

        if(head.next==null) return head;

        int length = 0;
        ListNode tem = head;
        while (tem != null) {
            tem = tem.next;
            length++;
        }

        k = k % length;
        if (k == 0) return head;

        for(int i=0;i<k;i++){
            ListNode temp=head;

            while(temp.next.next!=null){
                temp=temp.next;
            }
            System.out.print(temp.val);
            ListNode temp1=temp.next;
            temp.next=null;
            temp1.next=head;
            head=temp1;

        }
        return head;
    }
}
