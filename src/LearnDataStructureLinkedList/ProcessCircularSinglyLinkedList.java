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
public class ProcessCircularSinglyLinkedList {
    
    public static void main(String[] args)
    {
        int[] nodesData=new int[]{5,3,9,1,40};
        CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();
        
        System.out.println("===============================");
        System.out.println("insert to last of linked list");
        for(int i=0;i<nodesData.length;i++)
        {
            CircularSinglyLinkedList.insertLastNode(circularSinglyLinkedList, nodesData[i]);
        }
        CircularSinglyLinkedList.print(circularSinglyLinkedList);
        
        System.out.println("===============================");
        
        System.out.println("insert to begining of linked list");
        CircularSinglyLinkedList.insertFirstNode(circularSinglyLinkedList, 50);
        CircularSinglyLinkedList.print(circularSinglyLinkedList);
        
        System.out.println("===============================");
        
        System.out.println("Delete from begining of linked list");
        CircularSinglyLinkedList.DeleteFirstNode(circularSinglyLinkedList);
        CircularSinglyLinkedList.print(circularSinglyLinkedList);
        
        System.out.println("===============================");
        
        System.out.println("Delete from the end of linked list");
        CircularSinglyLinkedList.DeleteLastNode(circularSinglyLinkedList);
        CircularSinglyLinkedList.print(circularSinglyLinkedList);
        
        System.out.println("===============================");
        
        System.out.println("o-index linked list");
        System.out.println("Search for node in linked list");
        CircularSinglyLinkedList.SearchForNode(circularSinglyLinkedList, 9);
        CircularSinglyLinkedList.print(circularSinglyLinkedList);
    }
}
