package linkedlist_package;

public class circular_linkedlist<T>
{
    class Node
    {
        T data;
        Node next;
        Node prev;
        Node(T data)
        {
            this.data = data;
        }
    }
    Node head;

    public void add(T data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            head.next = head;
            head.prev = head;
            return;
        }
        Node currNode = head;
        while(currNode.next != head)
        {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        newNode.next = head;
        newNode.prev = currNode;
        head.prev = newNode;
    }

    public void add(int index, T data)
    {
        Node newNode = new Node(data);
        Node currNode = head;
        if(head == null)
        {
            System.out.println("LinkedList is Empty");
            return;
        }
        for(int i = 0; i < index; i++)
        {
            currNode = currNode.next;
        }
        if(currNode == head)
        {
            newNode.prev = currNode.prev;
            newNode.next = currNode;
            newNode.prev.next = newNode;
            head.prev = newNode;
            head = newNode;
            return;
        }
        newNode.prev = currNode.prev;
        currNode.prev.next = newNode;
        newNode.next = currNode;
        currNode.prev = newNode;
    }

    public void set(int index, T data)
    {
        Node newNode = new Node(data);
        Node currNode = head;
        if(head == null)
        {
            System.out.println("LinkedList is Empty");
            return;
        }
        for(int i = 0; i < index; i++)
        {
            currNode = currNode.next;
        }
        if(currNode == head)
        {
            newNode.prev = currNode.prev;
            currNode.prev.next = newNode;
            newNode.next = currNode.next;
            currNode.next.prev = newNode;
            head = newNode;
            return;            
        }
        newNode.prev = currNode.prev;
        currNode.prev.next = newNode;
        newNode.next = currNode.next;
        currNode.next.prev = newNode;
    }

    public void clear()
    {
        Node currNode = head;
        if(head == null)
        {
            System.out.println("LinkedList is Empty");
        }
        while(head != null)
        {
            if(head.next == head)
            {
                head = null;
                return;
            }
            currNode.prev.next = currNode.next;
            currNode.next.prev = currNode.prev;
            head = currNode.next;
            currNode = currNode.next;
        }
    }

    public void size()
    {
        int count = 0;
        Node currNode = head;
        if(head == null)
        {
            count = 0;
        }
        else
        {
            do
            {
                count++;
                currNode = currNode.next;
            }
            while(currNode != head);
        }
        System.out.println("Size of LinkedList: " + count);
    }

    public void get(int index)
    {
        Node currNode = head;
        if(head == null)
        {
            System.out.println("LinkedList is Empty");
            return;
        }
        for(int i = 0; i < index; i++)
        {
            currNode = currNode.next;
        }
        System.out.println(currNode.data);
    }

    public void isEmpty()
    {
        if(head == null)
        {
            System.out.println("LinkedList is Empty");
        }
        else
        {
            System.out.println("LinkedList is not Empty");
        }
    }

    public void remove(int index)
    {
        Node currNode = head;
        if(head == null)
        {
            System.out.println("LinkedList is empty");
            return;
        }
        for(int i = 0; i < index; i++)
        {
            currNode = currNode.next;
        }
        if(currNode == head)
        {
            currNode.prev.next = currNode.next;
            currNode.next.prev = currNode.prev;
            head = currNode.next;
            head.prev = currNode.prev;
            return;            
        }
        currNode.prev.next = currNode.next;
        currNode.next.prev = currNode.prev;
    }

    public void removeAll(T data)
    {
        Node currNode = head;
        if(head == null)
        {
            System.out.println("LinkedList is Empty");
            return;
        }
        while(currNode.data != data)
        {
            currNode = currNode.next;
        }
        if(currNode == head)
        {
            currNode.prev.next = currNode.next;
            currNode.next.prev = currNode.prev;
            head = currNode.next;
            head.prev = currNode.prev;
            return;
        }
        currNode.prev.next = currNode.next;
        currNode.next.prev = currNode.prev;
    }

    public void display()
    {
        Node currNode = head;
        if(head == null)
        {
            System.out.println("LinkedList is Empty");
            return;
        }
        do
        {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        while(currNode.next != head);
        System.out.println(currNode.data);
    }
}
