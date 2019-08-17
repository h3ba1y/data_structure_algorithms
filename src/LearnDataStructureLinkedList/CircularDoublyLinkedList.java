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
public class CircularDoublyLinkedList {
    
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
    
    public static CircularDoublyLinkedList insertLastNode(CircularDoublyLinkedList linkedList, int data)
    {
        Node newNode = new Node(data);
        
        if(linkedList.head == null)
        {
            System.out.println("this is the first node, data="+data);
            linkedList.head = newNode;
            newNode.next= linkedList.head;
            newNode.previous = linkedList.head;
            
        }else{
            System.out.println("Add new node in the last, data="+data);
            Node node = linkedList.head;
            while(node.next !=linkedList.head)
            {
                node = node.next;
            }
            
            node.next = newNode;
            newNode.previous = node;
            newNode.next = linkedList.head;
            linkedList.head.previous=newNode;
        }
        
        return linkedList;
    }
    
    public static CircularDoublyLinkedList insertFirstNode(CircularDoublyLinkedList linkedList, int data)
    {
        Node newNode = new Node(data);
        
        if(linkedList.head == null)
        {
            System.out.println("this is the first node, data="+data);
            newNode.next= linkedList.head;
            newNode.previous = linkedList.head;
            
        }else{
            System.out.println("Add new node in th first, data="+data);
            Node node = linkedList.head;
            linkedList.head = newNode;
            newNode.next = node;
            newNode.previous= node.previous;
            newNode.previous.next=linkedList.head;
            node.previous = newNode;
            
            
        }
        
        return linkedList;
    }
    
     
     public static CircularDoublyLinkedList DeleteLastNode(CircularDoublyLinkedList linkedList)
    {
      
        if(linkedList.head == null)
        {
            System.out.println("this is list is empty");
            
        }else{
            System.out.println("Delete last node");
            Node node = linkedList.head;
            while(node !=null)
            {   
                if(node.next.next==linkedList.head){
                    break;
                }
                node = node.next;
            }
            
            node.next = linkedList.head;
            linkedList.head.previous=node;
        }
        
        return linkedList;
    }
    
    public static CircularDoublyLinkedList DeleteFirstNode(CircularDoublyLinkedList linkedList)
    {
        
        if(linkedList.head == null)
        {
            System.out.println("this is list is empty");
            
        }else{
            System.out.println("Delete first node");
            Node tempNode = linkedList.head.next;
            tempNode.previous = linkedList.head.previous;
            linkedList.head = tempNode;
            tempNode.previous.next = linkedList.head;
            
        }
        
        return linkedList;
    }
    

     
    public static CircularDoublyLinkedList SearchForNode(CircularDoublyLinkedList linkedList, int requiredData)
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
    
    
    public static void print(CircularDoublyLinkedList linkedList)
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
        }while(node.next !=linkedList.head);
        
        System.out.println("Node #"+i+" data is :"+node.data);
    }
}
