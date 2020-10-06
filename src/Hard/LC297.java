package Hard;

import Extension.TreeNode;

import java.util.*;

public class LC297 {
    /*
    297. 二叉树的序列化与反序列化
     */
    class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            return rserialize(root,new StringBuilder()).toString();
        }

        public StringBuilder rserialize(TreeNode root,StringBuilder stringBuilder) {
            if (root==null) {
                stringBuilder.append("null,");
            }else {
                stringBuilder.append(root.val).append(",");
                stringBuilder = rserialize(root.left,stringBuilder);
                stringBuilder = rserialize(root.right,stringBuilder);
            }
            return stringBuilder;
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
                List<String> list=new LinkedList<>(Arrays.asList(data.split(",")));
            return rdeserialize(list);
        }

        public TreeNode rdeserialize(List<String> list) {
            if (list.get(0).equals("null")) {
                list.remove(0);
                return null;
            }
            TreeNode root=new TreeNode(Integer.parseInt(list.get(0)));
            list.remove(0);
            root.left=rdeserialize(list);
            root.right=rdeserialize(list);
            return root;
        }
    }
}
