package Trees;

public class Inorder
{
    public static void InorderTraversal(Node n1)
    {
        Node temp =n1;

        if(temp==null)
            return;
        InorderTraversal(temp.left);
        System.out.print(temp.val+" ");
        InorderTraversal(temp.right);
        return;
    }
}
