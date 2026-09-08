/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map = new HashMap<>(); // val , index
        Node temp = head;
        int s = 0; // starting index
        while (temp != null){
            map.put(temp,new Node(temp.val));
            temp = temp.next;
        }
        temp = head;
        while (temp != null){
            Node copy = map.get(temp);
            copy.next = map.get(temp.next);
            copy.random = map.get(temp.random);
            temp = temp.next;
        }
        return map.get(head);
    }
}
