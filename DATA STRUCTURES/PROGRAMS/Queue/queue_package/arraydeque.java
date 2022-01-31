package queue_package;

public class arraydeque<T>
{
    class Node
    {
        T data;
        Node next, prev;
        Node(T data)
        {
            this.data = data;
        }
    }
    Node head, tail;

    public void addFirst(T data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            head.next = null;
            head.prev = null;
            tail = head;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        newNode.prev = null;
        head = newNode;
    }

    public void addLast(T data)
    {
        Node newNode = new Node(data);
        Node currNode = head;
        if(head == null)
        {
            head = newNode;
            head.next = null;
            head.prev = null;
            tail = head;
            return;
        }
        while(currNode != tail)
        {
            currNode = currNode.next;
        }
        newNode.next = null;
        newNode.prev = currNode;
        currNode.next = newNode;
        tail = newNode;
    }

    public void removeFirst()
    {
        Node currNode = head;
        if(head == null)
        {
            System.out.println("Array Deque is Empty");
            return;
        }
        System.out.println("Element " + currNode.data + " removed");
        head = currNode.next;
        head.prev = null;
        currNode.next.prev = null;
    }

    public void removeLast()
    {
        Node currNode = tail;
        if(head == null)
        {
            System.out.println("Array Deque is Empty");
            return;
        }
        System.out.println("Element " + currNode.data + " removed");
        tail = currNode.prev;
        currNode.prev.next = null;
        tail.next = null;
    }

    public void getFirst()
    {
        if(head == null)
        {
            System.out.println("Array Deque is Empty");
            return;
        }
        System.out.println("Element " + head.data + " peeked");
    }

    public void getLast()
    {
        if(head == null)
        {
            System.out.println("Array Deque is Empty");
            return;
        }
        System.out.println("Element " + tail.data + " peeked");
    }

    public void print()
    {
        Node currNode = head;
        while(currNode != tail)
        {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
        System.out.println(currNode.data);
    }
    
}
