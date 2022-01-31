package linkedlist_package;

public class linkedlist<T>
{
    class Node          //Node Class
    {
        T data;
        Node next;
        Node(T data)
        {
            this.data = data;
            this.next = null;
        }
    }
    Node head;                  //Head Node
    
    public void add(T data)                     //Add at End of LinkedList
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        
        Node currNode = head;
        while(currNode.next != null)
        {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void add(int index, T data)                  //Add an element at a position of LinkedList
    {
        Node newNode = new Node(data);
        Node temp1 = head, temp2 = head;
        for(int i = 0; i < index; i++)
        {
            if(temp1 == null)
            {
                break;
            }
            temp2 = temp1;
            temp1 = temp1.next;
        }
        if(temp1 == head)
        {
            newNode.next = temp1;
            head = newNode;
            return;
        }        
        temp2.next = newNode;
        newNode.next = temp1;
    }

    public void set(int index, T data)              //Change a element from a given index
    {
        Node newNode = new Node(data);
        Node temp1 = head, temp2 = head;
        for(int i = 0; i < index; i++)
        {
            if(temp1 == null)
            {
                break;
            }
            temp2 = temp1;
            temp1 = temp1.next;
        }
        if(temp1 == head)
        {
            newNode.next = head.next;
            head = newNode;
            return;
        }
        temp2.next = newNode;
        newNode.next = temp1.next;
    }

    public void clear()                 //Clear LinkedList
    {
        while(head != null)
        {
            head = head.next;
        }
    }

    public void size()                  //Find the size of LinkedList
    {
        Node temp  = head;
        int count = 0;
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        System.out.println("Size of LinkedList is: " + count);
    }

    public void isEmpty()                       //Check if LinkedList is Empty or not
    {
        if(head == null)
        {
            System.out.println("List is Empty");
        }
        else
        {
            System.out.println("List is not Empty");
        }
    }

    public void remove(int index)
    {
        Node temp1 = head, temp2 = head;
        for(int i = 0; i < index; i++)
        {
            if(temp1 == null)
            {
                break;
            }
            temp2 = temp1;
            temp1 = temp1.next;
        }
        if(head == null)
        {
            System.out.println("LinkedList is Empty");
            return;
        }        
        temp2.next = temp1.next;
    }

    public void removeAll(T data)                       //Remove a particular element from LinkedList
    {
        Node temp1 = head, temp2 = head;
        while(temp1.data != data || temp1 == null)
        {
            temp2 = temp1;
            temp1 = temp1.next;
        }
        temp2.next = temp1.next;
        if(temp2.next != null)
        {
            removeAll(data);
        }
    }

    public void contains(T data)
    {
        Node temp = head;
        while(temp.data != data && temp.next != null)
        {
            temp = temp.next;
        }
        if(temp.data != data)
        {
            System.out.println("Element " + data + " Not Found");
        }
        else
        {
            System.out.println("Element " + data + " Found");
        }
    }

    public void get(int index)
    {
        Node temp1 = head;
        for(int i = 0; i < index; i++)
        {
            if(temp1 == null)
            {
                break;
            }
            temp1 = temp1.next;
        }
        System.out.println(temp1.data);
    }
    
    public void displayLL()                 //Printing the LinkedList
    {
        Node temp = head;
        if(head == null)
        {
            System.out.println("List is empty");
        }
        else
        {
            while(temp.next != null)
            {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }
}