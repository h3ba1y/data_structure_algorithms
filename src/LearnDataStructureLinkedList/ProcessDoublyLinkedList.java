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
public class ProcessDoublyLinkedList {
    
    public static void main(String[] args)
    {
        int[] nodesData=new int[]{5,3,9,1,40};
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        
        System.out.println("===============================");
        System.out.println("insert to last of linked list");
        for(int i=0;i<nodesData.length;i++)
        {
            DoublyLinkedList.insertLastNode(doublyLinkedList, nodesData[i]);
        }
        DoublyLinkedList.print(doublyLinkedList);
        
        System.out.println("===============================");
        
        System.out.println("insert to begining of linked list");
        DoublyLinkedList.insertFirstNode(doublyLinkedList, 50);
        DoublyLinkedList.print(doublyLinkedList);
        
        System.out.println("===============================");
        
        System.out.println("insert after specific node of linked list");
        System.out.println("insert after second element");
        DoublyLinkedList.insertAfterNode(doublyLinkedList, doublyLinkedList.head.next, -37);
        DoublyLinkedList.print(doublyLinkedList);
        
        System.out.println("===============================");
        
        System.out.println("Delete from begining of linked list");
        DoublyLinkedList.DeleteFirstNode(doublyLinkedList);
        DoublyLinkedList.print(doublyLinkedList);
        
        System.out.println("===============================");
        
        System.out.println("Delete from the end of linked list");
        DoublyLinkedList.DeleteLastNode(doublyLinkedList);
        DoublyLinkedList.print(doublyLinkedList);
        
        System.out.println("===============================");
        
        System.out.println("Delete after specific node of linked list");
        DoublyLinkedList.DeleteAfterNode(doublyLinkedList, doublyLinkedList.head.next);
        DoublyLinkedList.print(doublyLinkedList);
        
        System.out.println("===============================");
        
        System.out.println("o-index linked list");
        System.out.println("Search for node in linked list");
        DoublyLinkedList.SearchForNode(doublyLinkedList, 9);
        DoublyLinkedList.print(doublyLinkedList);
    }
}
