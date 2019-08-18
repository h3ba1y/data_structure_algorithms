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
public class ProcessLinkedListStack {
    
    public static void main(String[] args) {
        for(int i=1; i<= 10;i++ ){
            LinkedListStack.push(i);
        }
        
        System.out.println("Push elements to stack");
        
        LinkedListStack.print(LinkedListStack.singlyLinkedList);
        
        
        LinkedListStack.pop();
        LinkedListStack.pop();
        System.out.println("Pop element from stack");
        
         LinkedListStack.print(LinkedListStack.singlyLinkedList);
        
        
 
    }
    
}
