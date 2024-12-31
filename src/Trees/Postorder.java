package Trees;

public class Postorder
{
    public static void PostTraversal(Node n1)
    {
        Node temp =n1;

        if(temp==null)
            return;
        PostTraversal(temp.left);
        PostTraversal(temp.right);
        System.out.print(temp.val +" ");
        return;
    }
}
