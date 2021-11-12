package Tree;
import Tree.BT; // BT is class which is used to create binary tree all code to create binary tree is written in BT
public class maxInBinaryTree {




    public static void main(String[] args) {
        BT   obj  = new BT();
        BT.Node root = obj.createNode();

        int res = max(root);

        System.out.println("Max in Binary Tree is:"+res);
    }

    private static int max(BT.Node root) {
       if(root == null){
           return 0;
       }
       int left_max = Math.max(root.data,max(root.left));
       int right_max = Math.max(root.data,max(root.right));

       return Math.max(left_max,right_max);
    }
}
