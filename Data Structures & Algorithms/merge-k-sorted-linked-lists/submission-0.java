class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ans = new ListNode(-1);
        ListNode temp = ans;

        List<Integer> l = new ArrayList<>();

        for (ListNode n : lists) {
            while (n != null) {
                l.add(n.val);
                n = n.next;
            }
        }

        Collections.sort(l);

        for (int i = 0; i < l.size(); i++) {
            temp.next = new ListNode(l.get(i));
            temp = temp.next;
        }

        return ans.next;
    }
}
