package queue_package;

public class queue<T>
{
    class Node
    {
        T data;
        Node next;
        Node prev;
        Node(T data)
        {
            this.data = data;
            this.next = null;
        }
    }
    Node head, rear;

    public void offer(T data)
    {
        Node newNode = new Node(data);
        Node currNode = head;
        if(head == null)
        {
            head = newNode;
            rear = head;
            return;
        }
        while(currNode != rear)
        {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        newNode.next = null;
        rear = newNode;
    }

    public void poll()
    {
        Node currNode = head;
        if(head == null)
        {
            System.out.println("Queue is Empty");
            return;
        }        
        System.out.println("Element " + rear.data + " popped");
        if(currNode == rear)
        {
            rear = head = null;
            return;
        }
        while(currNode.next != rear)
        {
            currNode = currNode.next;
        }
        rear = currNode;
    }

    public void peek()
    {
        if(head == null)
        {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Element " + rear.data + " is at Top");
    }

    public void print()
    {
        Node currNode = head;
        if(head == null)
        {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("[ ");
        while(currNode != rear)
        {
            System.out.print(currNode.data + ", ");
            currNode = currNode.next;
        }
        System.out.println(currNode.data + " ]");
    }

}
