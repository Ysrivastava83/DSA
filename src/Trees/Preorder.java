package Trees;

public class Preorder
{
    public static void PreorderTraversal(Node n1)
    {
        Node temp=n1;

        if(temp==null)
            return;
        System.out.print(temp.val+" ");
        PreorderTraversal(temp.left);
        PreorderTraversal(temp.right);
        return;
    }
}
