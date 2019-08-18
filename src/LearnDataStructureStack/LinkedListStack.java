/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LearnDataStructureStack;

import LearnDataStructureLinkedList.SinglyLinkedList;

/**
 *
 * @author hebatarek
 */
public class LinkedListStack {
    
    public static SinglyLinkedList singlyLinkedList;
    
    
    public static void push(int data)
    {
        
        if(singlyLinkedList== null){
            System.out.println("add first node");
            singlyLinkedList = new SinglyLinkedList();
            
        }
        
        SinglyLinkedList.insertLastNode(singlyLinkedList, data);
    }
    
    public static void pop()
    {
        if(singlyLinkedList== null){
             System.out.println("this stack is empty");
        }else{
            System.out.println("this is poped");
            SinglyLinkedList.DeleteLastNode(singlyLinkedList);
        }
    }
    
    public static void print(SinglyLinkedList singlyLinkedList)
    {
        SinglyLinkedList.print(singlyLinkedList);
    }
    
    
    
    
}
