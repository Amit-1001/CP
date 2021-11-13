package Tree;

public class childrenSumProperty {
    public static void main(String[] args) {
        BT obj = new BT();

        BT.Node root;
        root = obj.createNode();

          boolean res = isChildrenSum(root);
            if (res){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
    }

    private static boolean isChildrenSum(BT.Node root) {


        if(root==null){
            return true;
        }

        if (root.left == null && root.right== null){ // is there is only one node this condition will return true
            return true;
        }

        int sum =0;

        if(root.left!=null){ // recursively check for left node, we keep left most node data in sum
            sum += root.left.data;
        }
        if(root.right!=null){ // recursively check for right node data, we keep right most data in sum
            sum += root.right.data;
        }
        // after above if statements sum will be left node data + right node data

        // we check if root == left node data + right node data
        // if both are equal we recursively call for remaining  left node and right node
        return (root.data == sum) && isChildrenSum(root.left) && isChildrenSum(root.right);
    }
}
