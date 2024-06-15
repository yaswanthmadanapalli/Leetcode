class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       int lengthA=getLength(headA);
        int lengthB=getLength(headB);
        while(lengthA>lengthB){
            lengthA--;
            headA=headA.next;
        }
        while(lengthB>lengthA){
            lengthB--;
            headB=headB.next;
        }
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;

        

    }
    public int getLength(ListNode current_node){
        int length=0;
        while(current_node!=null){
            length++;
            current_node=current_node.next;
        }
        return length;
    }
}