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
    public ListNode deleteDuplicates(ListNode head) {

        // //Step1: covert linkedList to arrayList
        // List<Integer> values=new ArrayList<>();
        // ListNode current=head;
        // while(current!=null){
        //     values.add(current.val);
        //     current=current.next;
        // }

        // //Step2: Sorting.
        // Collections.sort(values);

        // //Step3: ArrayList to LinkedList
        // ListNode dummy=new ListNode(0);
        // ListNode newCurrent=dummy;
        // for(int i=0;i<values.size();i++){
        //     newCurrent.next=new ListNode(values.get(i));
        //     newCurrent=newCurrent.next;
        // }
        // ListNode sortedHead=dummy.next;

        //Step4: Removing Duplicates.
        //ListNode sortedCurrent=sortedHead;
        ListNode sortedCurrent=head;
        while(sortedCurrent!=null && sortedCurrent.next!=null){
            if(sortedCurrent.val==sortedCurrent.next.val){
                sortedCurrent.next=sortedCurrent.next.next;
            }
            else{
                sortedCurrent=sortedCurrent.next;
            }
        }

        return head;

    }
}