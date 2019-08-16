/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LearnDataStructureLinkedList;

/**
 *
 * @author hebatarek
 */
public class DoublyLinkedList {
    
    Node head = null;
    
    static class Node{
        int data;
        Node next;
        Node previous;

        public Node(int d)
        {
            this.data = d;
            this.previous=null;
            this.next = null;
        }
    }
    
    public static DoublyLinkedList insertLastNode(DoublyLinkedList linkedList, int data)
    {
        Node newNode = new Node(data);
        
        if(linkedList.head == null)
        {
            System.out.println("this is the first node, data="+data);
            linkedList.head = newNode;
            
        }else{
            System.out.println("Add new node in the last, data="+data);
            Node node = linkedList.head;
            while(node.next !=null)
            {
                node = node.next;
            }
            
            node.next = newNode;
            newNode.previous = node;
        }
        
        return linkedList;
    }
    
    public static DoublyLinkedList insertFirstNode(DoublyLinkedList linkedList, int data)
    {
        Node newNode = new Node(data);
        
        if(linkedList.head == null)
        {
            System.out.println("this is the first node, data="+data);
            linkedList.head = newNode;
            
        }else{
            System.out.println("Add new node in th first, data="+data);
            Node node = linkedList.head;
            linkedList.head = newNode;
            linkedList.head.next = node;
            node.previous = newNode;
        }
        
        return linkedList;
    }
    
     public static DoublyLinkedList insertAfterNode(DoublyLinkedList linkedList, Node node, int data)
    {
        Node newNode = new Node(data);
        
        if(linkedList.head == null)
        {
            System.out.println("Linked list is empty");
        }else{
            System.out.println("Insert new node after specific node, data="+data);
            Node temp = linkedList.head;
           
            while(temp != node && temp.next!=null)
            {
                temp = temp.next;
            }
            Node tempNext = temp.next;
            temp.next = newNode;
            newNode.next = tempNext;
        }
        
        return linkedList;
    }
     
     public static DoublyLinkedList DeleteLastNode(DoublyLinkedList linkedList)
    {
      
        if(linkedList.head == null)
        {
            System.out.println("this is list is empty");
            
        }else{
            System.out.println("Delete last node");
            Node node = linkedList.head;
            while(node !=null)
            {   
                if(node.next.next==null){
                    break;
                }
                node = node.next;
            }
            
            node.next = null;
        }
        
        return linkedList;
    }
    
    public static DoublyLinkedList DeleteFirstNode(DoublyLinkedList linkedList)
    {
        
        if(linkedList.head == null)
        {
            System.out.println("this is list is empty");
            
        }else{
            System.out.println("Delete first node");
            Node tempNode = linkedList.head.next;
            linkedList.head = tempNode;
            linkedList.head.previous=null;
        }
        
        return linkedList;
    }
    
     public static DoublyLinkedList DeleteAfterNode(DoublyLinkedList linkedList, Node node)
    {
        if(linkedList.head == null)
        {
            System.out.println("Linked list is empty");
        }else{
            System.out.println("Delete after specific node");
            Node temp = linkedList.head;
           
            while(temp != node && temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next.previous = temp;
        }
        
        return linkedList;
    }
     
    public static DoublyLinkedList SearchForNode(DoublyLinkedList linkedList, int requiredData)
    {
        if(linkedList.head == null)
        {
            System.out.println("Linked list is empty");
        }else{
            System.out.println("Search after specific node");
            Node temp = linkedList.head;
            int index = 0;
            while(temp.next!=null)
            {
                if(temp.data == requiredData){
                    break;
                }
                temp = temp.next;
                index++;
            }
            if(temp.data == requiredData){
                System.out.println("Node is found, it's index ="+index);
            }else{
                System.out.println("Node is not found");
            }
            
        }
        
        return linkedList;
    }
    
    
    public static void print(DoublyLinkedList linkedList)
    {
        Node node = linkedList.head;
        if(node == null)
        {
            System.out.println("List is empty");
        }
        int i=1;
        do{
            System.out.println("Node #"+i+" data is :"+node.data);
            node = node.next;
            i++;
        }while(node.next !=null);
        
        System.out.println("Node #"+i+" data is :"+node.data);
    }
}
