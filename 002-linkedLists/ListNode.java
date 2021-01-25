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

    public ListNode deleteAtHead(ListNode head) {
        //null or head was the only node
        if(head==null || head.next==null) return null;
        
        ListNode newHead = head.next;
        head = null;
        return newHead;
    }

    //could be improved by using node.next.next
    public ListNode findMiddleNode(ListNode head) {
        if(head==null || head.next==null) return head;
        
        boolean reachedEnd = false;
        ListNode behind = head, front = head; 
        while(!reachedEnd){
            for(int i=0; i<2; i++){
                front = front.next;
                if(front == null){
                    reachedEnd = true;
                    break;
                }
            }
            if(!reachedEnd) behind = behind.next;
        }
        
        return behind;
    }
}