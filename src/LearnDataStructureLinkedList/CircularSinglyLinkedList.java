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
public class CircularSinglyLinkedList {
    
    Node head = null;
    
    static class Node{
        int data;
        Node next;

        public Node(int d)
        {
            this.data = d;
            this.next = null;
        }
    }
    
    public static CircularSinglyLinkedList insertLastNode(CircularSinglyLinkedList linkedList, int data)
    {
        Node newNode = new Node(data);
        
        if(linkedList.head == null)
        {
            System.out.println("this is the first node, data="+data);
            linkedList.head = newNode;
            newNode.next= linkedList.head;
            
        }else{
            System.out.println("Add new node in the last, data="+data);
            Node node = linkedList.head;
            while(node.next !=linkedList.head)
            {
                node = node.next;
            }
            
            node.next = newNode;
            newNode.next = linkedList.head;
        }
        
        return linkedList;
    }
    
    public static CircularSinglyLinkedList insertFirstNode(CircularSinglyLinkedList linkedList, int data)
    {
        Node newNode = new Node(data);
        
        if(linkedList.head == null)
        {
            System.out.println("this is the first node, data="+data);
            newNode.next= linkedList.head;
            
        }else{
            System.out.println("Add new node in th first, data="+data);
            Node node = linkedList.head;
            while(node.next!=linkedList.head){
                node=node.next;
            }
            newNode.next=node.next;
            node.next = newNode;
            linkedList.head = newNode;
            
            
        }
        
        return linkedList;
    }
    
     
     public static CircularSinglyLinkedList DeleteLastNode(CircularSinglyLinkedList linkedList)
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
        }
        
        return linkedList;
    }
    
    public static CircularSinglyLinkedList DeleteFirstNode(CircularSinglyLinkedList linkedList)
    {
        
        if(linkedList.head == null)
        {
            System.out.println("this is list is empty");
            
        }else{
            System.out.println("Delete first node");
            Node node = linkedList.head;
            while(node.next!=linkedList.head){
                node=node.next;
            }
            node.next = linkedList.head.next;
            linkedList.head = linkedList.head.next;
            
        }
        
        return linkedList;
    }
    

     
    public static CircularSinglyLinkedList SearchForNode(CircularSinglyLinkedList linkedList, int requiredData)
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
    
    
    public static void print(CircularSinglyLinkedList linkedList)
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
