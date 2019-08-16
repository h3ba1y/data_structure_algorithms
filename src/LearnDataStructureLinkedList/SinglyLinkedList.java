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
public class SinglyLinkedList {
    
    Node head = null;
    
    static class Node{
        int data;
        Node next = null;

        public Node(int d)
        {
            this.data = d;
        }
    }
    
    public static SinglyLinkedList insertLastNode(SinglyLinkedList linkedList, int data)
    {
        Node newNode = new Node(data);
        newNode.next = null;
        
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
        }
        
        return linkedList;
    }
    
    public static SinglyLinkedList insertFirstNode(SinglyLinkedList linkedList, int data)
    {
        Node newNode = new Node(data);
        newNode.next = null;
        
        if(linkedList.head == null)
        {
            System.out.println("this is the first node, data="+data);
            linkedList.head = newNode;
            
        }else{
            System.out.println("Add new node in th first, data="+data);
            Node node = linkedList.head;
            linkedList.head = newNode;
            linkedList.head.next = node;
        }
        
        return linkedList;
    }
    
     public static SinglyLinkedList insertAfterNode(SinglyLinkedList linkedList, Node node, int data)
    {
        Node newNode = new Node(data);
        newNode.next = null;
        
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
     
     public static SinglyLinkedList DeleteLastNode(SinglyLinkedList linkedList)
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
    
    public static SinglyLinkedList DeleteFirstNode(SinglyLinkedList linkedList)
    {
        
        if(linkedList.head == null)
        {
            System.out.println("this is list is empty");
            
        }else{
            System.out.println("Delete first node");
            Node tempNode = linkedList.head.next;
            linkedList.head = tempNode;
        }
        
        return linkedList;
    }
    
     public static SinglyLinkedList DeleteAfterNode(SinglyLinkedList linkedList, Node node)
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
        }
        
        return linkedList;
    }
     
    public static SinglyLinkedList SearchForNode(SinglyLinkedList linkedList, int requiredData)
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
    
    
    public static void print(SinglyLinkedList linkedList)
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
