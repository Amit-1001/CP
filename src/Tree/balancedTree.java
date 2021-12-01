package Tree;

public class balancedTree extends BT {

    //In a Balanced Binary Tree for every node, the difference between heights of left subtree and right subtree should not be more than one.

    public static void main(String[] args) {
        BT obj = new BT();

        BT.Node root;

        root = obj.createNode();

        //Boolean res = naiveBalanced(root);
        //System.out.println("(Naive Approach) Tree is balanced:"+res);

        int result = efficientBalanaced(root);

        if(result == -1){
            System.out.println("Tree is not balanced");
        }
        else{
            System.out.println("Tree is balanced");
        }

    }

    private static int efficientBalanaced(Node root) {

        if(root == null){
            return  0;
        }

        int left = efficientBalanaced(root.left);
        if(left == -1){
            return  -1;
        }

        int right = efficientBalanaced(root.right);
        if(right ==-1){
            return  -1;
        }

        if(Math.abs(left-right)> 1){
            return  -1;
        }
        else{
            return Math.max(left,right)+1;
        }
    }

    private static Boolean naiveBalanced(Node root) {

        if(root == null){
            return true;
        }
        int leftHeight = height(root.left); // recursively checking left height
        int rightHeight = height(root.right); // recursively checking right height

        return (Math.abs(leftHeight - rightHeight) <=1 && naiveBalanced(root.left) && naiveBalanced(root.right));

    }


    public static int height(Node root){
        if(root == null){
            return  0;
        }
        return (Math.max(height(root.left),height(root.right))+1);
    }
}
