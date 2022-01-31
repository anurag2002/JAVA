package linkedlist_package;

public class stack<T>
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
    Node head;

    public void push(T data)
    {
        Node newNode = new Node(data);
        Node currNode = head;
        if(head == null)
        {
            head = newNode;
            return;
        }
        while(currNode.next != null)
        {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        newNode.prev = currNode;
    }

    public void pop()
    {
        Node currNode = head;
        if(head == null)
        {
            System.out.println("Stack is Empty");
            return;
        }
        while(currNode.next != null)
        {
            currNode = currNode.next;
        }
        System.out.println("Element " + currNode.data + " popped");
        if(currNode.prev == null)
        {
            currNode = null;
            head = currNode;
            return;
        }
        currNode.prev.next = null;
    }

    public void peek()
    {
        Node currNode = head;
        if(head == null)
        {
            System.out.println("Stack is Empty");
            return;
        }
        while(currNode.next != null)
        {
            currNode = currNode.next;
        }
        System.out.println("Element " + currNode.data + " is at top");
    }

    public void search(T data)
    {
        Node currNode = head;
        if(head == null)
        {
            System.out.println("Stack is Empty");
            return;
        }
        while(currNode.data != data && currNode.next != null)
        {
            currNode = currNode.next;
        }
        if(currNode.data == data)
        {
            System.out.println("Element " + data + " Found");
            return;
        }
        else
        {
            System.out.println("Element " + data + " Not Found");
        }
    }

    public boolean empty()
    {
        if(head == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void print()
    {
        Node currNode = head;
        if(head == null)
        {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.print("[");
        while(currNode.next != null)
        {
            System.out.print(" " + currNode.data + ",");
            currNode = currNode.next;
        }
        System.out.println(" " + currNode.data + " ]");

    }

}
