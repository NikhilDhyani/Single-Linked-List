public class MainClass {

    public static void main(String [] args)
    {

        LinkedList linkedList = new LinkedList();

        linkedList.insert(0);
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);

        linkedList.insert(5);

        linkedList.insertAt(3,-1);


        linkedList.show();
    }
}
