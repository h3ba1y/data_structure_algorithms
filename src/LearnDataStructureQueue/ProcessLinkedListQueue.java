/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LearnDataStructureQueue;

/**
 *
 * @author hebatarek
 */
public class ProcessLinkedListQueue {
    
    public static void main(String[] args) {
        for(int i=1; i<= 10;i++ ){
            LinkedListQueue.enqueue(i);
        }
        
        System.out.println("Push elements to stack");
        
        LinkedListQueue.print(LinkedListQueue.singlyLinkedList);
        
        
        LinkedListQueue.dequeue();
        LinkedListQueue.dequeue();
        System.out.println("Pop element from stack");
        
         LinkedListQueue.print(LinkedListQueue.singlyLinkedList);
        
        
 
    }
    
}
