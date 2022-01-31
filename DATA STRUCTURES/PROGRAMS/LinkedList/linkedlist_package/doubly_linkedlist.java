package linkedlist_package;

public class doubly_linkedlist<T>
{
    class Node
    {
        T data;
        Node next;
        Node prev;
        public Node(T data)
        {
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    public void add(T data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            newNode.next = null;
            newNode.prev = head;
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null)
        {
            currNode = currNode.next;
        }
        newNode.prev = currNode;
        currNode.next = newNode;
        newNode.next = null;
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
            System.out.println(i);
            if(currNode == null)
            {
                break;
            }
            currNode = currNode.next;
        }
        if(currNode == head)
        {
            newNode.prev = null;
            newNode.next = currNode;
            head = newNode;
            return;
        }
        newNode.prev = currNode.prev;
        newNode.next = currNode;
        currNode.prev.next = newNode;
    }

    public void set(int index, T data)
    {
        Node newNode = new Node(data);
        Node currNode = head;
        for(int i = 0; i < index; i++)
        {
            if(currNode == null)
            {
                break;
            }
            currNode = currNode.next;
        }
        if(currNode == head)
        {
            newNode.next = head.next;
            head = newNode;
            return;
        }
        else if(currNode.prev == null)
        {
            head.next = newNode;
            newNode.next = currNode.next;
            return;
        }
        currNode.prev.next = newNode;
        newNode.next = currNode.next;
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

    public void remove(int index)
    {
        Node currNode = head;
        for(int i = 0; i < index; i++)
        {
            currNode = currNode.next;
        }
        if(currNode == head)
        {
            head = currNode.next;
            return;
        }
        currNode.prev.next = currNode.next;
    }

    public void removeAll(T data)
    {
        Node currNode = head;
        while(currNode.data != data)
        {
            currNode = currNode.next;
        }
        if(currNode == head)
        {
            head = currNode.next;
            return;
        }
        currNode.prev.next = currNode.next;
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

    public void clear()
    {
        while(head != null)
        {
            head = head.next;
        }
    }

    public void size()
    {
        Node currNode = head;
        int count = 0;
        while(currNode != null)
        {
            count++;
            currNode = currNode.next;
        }
        System.out.println("Size of LinkedList is: " + count);
    }

    public void display()
    {
        Node currNode = head;
        if(head == null)
        {
            System.out.println("LinkedList is Empty");
            return;
        }
        while(currNode.next != null)
        {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println(currNode.data);
    }

}