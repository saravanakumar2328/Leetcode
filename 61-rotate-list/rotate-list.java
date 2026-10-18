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
     List<Integer> l1=new ArrayList<>();
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return head;
        }
        ListNode last=head;
       
       
        while(last!=null){
            l1.add(last.val);
            last=last.next;
           

        }
        if(k!=0){
        k=k%l1.size();
        }
        reverse(0,l1.size()-1);
        reverse(0,k-1);
        reverse(k,l1.size()-1);
          ListNode head1=null;
          ListNode temp11=null;
        for(int p=0;p<l1.size();p++){
            ListNode newn=new ListNode(l1.get(p));
            if(head1==null){
                head1=newn;
                head1.next=null;
                temp11=head1;
            }
            else{
                temp11.next=newn;
                temp11=temp11.next;

            }
        }
        return head1;
        



        
    }
        void reverse(int s,int e){
           while(s<e)
{
    int temp=l1.get(s);
    l1.set(s,l1.get(e));
    l1.set(e,temp);
    s++;
    e--;
}        }
    
}