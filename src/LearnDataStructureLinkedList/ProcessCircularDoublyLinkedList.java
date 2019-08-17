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
public class ProcessCircularDoublyLinkedList {
    
    public static void main(String[] args)
    {
        int[] nodesData=new int[]{5,3,9,1,40};
        CircularDoublyLinkedList circularDoublyLinkedList = new CircularDoublyLinkedList();
        
        System.out.println("===============================");
        System.out.println("insert to last of linked list");
        for(int i=0;i<nodesData.length;i++)
        {
            CircularDoublyLinkedList.insertLastNode(circularDoublyLinkedList, nodesData[i]);
        }
        CircularDoublyLinkedList.print(circularDoublyLinkedList);
        
        System.out.println("===============================");
        
        System.out.println("insert to begining of linked list");
        CircularDoublyLinkedList.insertFirstNode(circularDoublyLinkedList, 50);
        CircularDoublyLinkedList.print(circularDoublyLinkedList);
        
        System.out.println("===============================");
        
        System.out.println("Delete from begining of linked list");
        CircularDoublyLinkedList.DeleteFirstNode(circularDoublyLinkedList);
        CircularDoublyLinkedList.print(circularDoublyLinkedList);
        
        System.out.println("===============================");
        
        System.out.println("Delete from the end of linked list");
        CircularDoublyLinkedList.DeleteLastNode(circularDoublyLinkedList);
        CircularDoublyLinkedList.print(circularDoublyLinkedList);
        
        System.out.println("===============================");
        
        System.out.println("o-index linked list");
        System.out.println("Search for node in linked list");
        CircularDoublyLinkedList.SearchForNode(circularDoublyLinkedList, 9);
        CircularDoublyLinkedList.print(circularDoublyLinkedList);
    }
}
