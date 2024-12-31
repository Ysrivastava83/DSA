package Trees;

import java.sql.SQLOutput;

public class Tree
{
    public static void main(String[] args)
    {
        Node n3=new Node(15);            //             5
        Node n2= new Node(5);           //             / \
        Node n1=new Node(n2,10,n3);     //            10  15
       // Inorder.InorderTraversal(n1);

        System.out.println();

        Node root=new Node(1);          //          1
        root.left=new Node(2);          //        /   \
        root.right=new Node(3);         //       2     3
        root.left.left=new Node(4);     //      / \   / \
        root.left.right=new Node(5);   //      4   5 6   7
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        System.out.println("Inorder:");
        Inorder.InorderTraversal(root);    //  4,2,5,1,6,3,7
        System.out.println();

        System.out.println("Postorder:");
        Postorder.PostTraversal(root);    //  4,5,2,6,7,3,1
        System.out.println();

        System.out.println("Preorder");
        Preorder.PreorderTraversal(root); //  1,2,4,5,3,6,7
        System.out.println();

    }

}

class Node
{
    Node left;
    int val;
    Node right;

    Node(Node left,int val,Node right)
    {
        this.left=left;
        this.val=val;
        this.right=right;
    }
    Node(int val)
    {
        this.val=val;
    }
}