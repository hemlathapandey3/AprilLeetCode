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
    public boolean isPalindrome(ListNode head) {
        
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;
        int count=0;
        
        if(head == null || head.next == null)
            return true;
        
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        
         ListNode temp2 = head;
         int mid = count/2;
        while(mid>0)
        {
            st.add(temp2.val);
            temp2=temp2.next;
            mid--;
        }
        
        if(count%2 != 0){
       
        temp2=temp2.next;
        }
        
        
        while(temp2!=null)
        {
            if(st.peek()!=temp2.val)
                return false;
            st.pop();
            temp2=temp2.next;
        }
        return true;
        
        
    }
}
