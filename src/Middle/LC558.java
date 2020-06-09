package Middle;

import Extension.Node;

public class LC558 {
    /*
    558. 四叉树交集
     */
    class Solution {
        public Node intersect(Node quadTree1, Node quadTree2) {
            //当节点没有子节点时，需要合并并返回
            if (quadTree1.isLeaf || quadTree2.isLeaf)
            {
                if (quadTree1.isLeaf && quadTree2.isLeaf) {//两个子节点直接合并
                    boolean b = quadTree1.val || quadTree2.val;
                    return new Node(b, true, null, null, null, null);
                }
                //如果只是其中一个是完结的子节点，看情况返回
                if (quadTree1.isLeaf) {
                    if (quadTree1.val)  return quadTree1;
                    else                return quadTree2;
                }else {
                    if (quadTree2.val)  return quadTree2;
                    else                return quadTree1;
                }
            }

            //以上判断完毕，无法在此节点结束，需要往下
            Node node=new Node(false,false,null,null,null,null);
            node.topLeft=intersect(quadTree1.topLeft,quadTree2.topLeft);
            node.topRight=intersect(quadTree1.topRight,quadTree2.topRight);
            node.bottomLeft=intersect(quadTree1.bottomLeft,quadTree2.bottomLeft);
            node.bottomRight=intersect(quadTree1.bottomRight,quadTree2.bottomRight);

            if (node.topLeft.isLeaf && node.topRight.isLeaf && node.bottomLeft.isLeaf && node.bottomRight.isLeaf) {
                boolean b=node.topLeft.val;
                if (node.topRight.val==b && node.bottomLeft.val==b && node.bottomRight.val==b) {
                    return new Node(b,true,null,null,null,null);
                }
            }

            return node;
        }
    }
}
