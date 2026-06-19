
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
     if(lists.length == 0) return null;
     int n = lists.length;
    while(n >1){
            ListNode a = lists[n - 1];
            ListNode b = lists[n - 2];
            lists[n - 2] = merge(a, b);
            n--;

    }
    return lists[0];
        
    }
        ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-69);
        ListNode i = list1;
        ListNode j = list2;
        ListNode k = dummy;
        while(i != null && j!= null){
            if(i.val<=j.val){
                k.next = i;
                i = i.next;
            }
            else{
                k.next = j;
                j = j.next;
            }
            k = k.next;
        }
        if(i==null) k.next = j;
        else k.next = i;
        return dummy.next;
        
    }
}