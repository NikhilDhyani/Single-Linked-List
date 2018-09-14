public class LinkedList
{
    Node head;
    Node tempNext;

    public void insert(int data)
    {

        Node node = new Node();

        node.data = data;
        node.next = null;

        if (head==null)
        {
            head = node;

        }
        else
            {
               Node n = head;

               while (n.next!=null)
               {
                   n = n.next;
                   String x = Integer.toString(n.data);
               }
               n.next  = node;
            }

    }

    public void insertAtStart(int data)
    {

        Node node = new Node();

        node.data = data;
        node.next = head;

        head = node;


    }

    public void  insertAt(int index,int data)
    {
        Node node = new Node();

       Node n = head;

        int x = 0;

        while(n.next!=null)
        {

            if(x == index-1)
            {
                 tempNext = n.next;

                node.data = data;
                node.next = tempNext;

                //Update previous index to point to new index

                n.next = node;




            }
                x=x+1;

               n = n.next;
        }


    }


    public void show()

    {
        Node node = head;

        if (node.next==null)
        {
            System.out.println(node.data);

        }

        while (node.next!=null)
        {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);

    }
}
