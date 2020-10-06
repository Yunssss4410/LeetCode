package Extension;

public class LinkedNode {
    public Object val;
    public LinkedNode pre;
    public LinkedNode next;
    public LinkedNode() {}
    public LinkedNode(int val) { this.val = val; }
    public LinkedNode(Object val, LinkedNode left, LinkedNode right) {
        this.val = val;
        this.pre = left;
        this.pre = right;
    }
}
