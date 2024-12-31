package LinkedList;

class LinkedList{
    public static void main(String args[])
    {
        Node node1=new Node(6,null);
        Node node2=new Node(5,node1);
        Node node3=new Node(4,node2);
        Node node4=new Node(3,node3);
        Node node5=new Node(2,node4);
        Node node6=new Node(1,node5);
        Node head=node6;
        int num=3;
        test.add(head,num);
        while(head!=null)
        {
            System.out.println(head.data);
            head=head.address;
        }
    }
}
class Node
{
    int data;
    Node address;

    Node(int d,Node a)
    {
        data=d;
        address=a;
    }
}

class test
{
    public static Node add(Node head,int num)
    {
        Node temp=head;
        for(int i=0;i<num-1;i++)
        {
            head=head.address;
        }

        Node node=new Node(7,head.address);
        head.address=node;
        return temp;
    }
}
