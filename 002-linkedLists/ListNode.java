public class ListNode {
    int data;
    ListNode next;        
    ListNode(int data) { this.data = data; }

    public ListNode insertAtHead(ListNode head, int data) {
        ListNode newHead = new ListNode(data);
        newHead.next = head;
        return newHead;
    }

    public ListNode insertAtTail(ListNode head, int data) {
        //pointer
        ListNode curr = head;
        
        if(head == null) return new ListNode(data);
        
        while(curr.next != null){
            curr = curr.next;
        }
        
        curr.next = new ListNode(data);
        return head;
    }  

    //could be improved. It's possible to solve just with one pointer, using node.next.next
    public ListNode deleteAtTail(ListNode head) {
        if(head==null || head.next==null) return null;
        
        ListNode behind = head;
        ListNode ahead = behind.next;
        while(ahead.next!=null){
            behind = ahead;
            ahead = ahead.next;
        }
        
        behind.next = null;
        return head;
    }
}