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
public class ProcessSinglyLinkedList {
    
    public static void main(String[] args)
    {
        int[] nodesData=new int[]{5,3,9,1,40};
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        
        System.out.println("===============================");
        System.out.println("insert to last of linked list");
        for(int i=0;i<nodesData.length;i++)
        {
            SinglyLinkedList.insertLastNode(singlyLinkedList, nodesData[i]);
        }
        SinglyLinkedList.print(singlyLinkedList);
        
        System.out.println("===============================");
        
        System.out.println("insert to begining of linked list");
        SinglyLinkedList.insertFirstNode(singlyLinkedList, 50);
        SinglyLinkedList.print(singlyLinkedList);
        
        System.out.println("===============================");
        
        System.out.println("insert after specific node of linked list");
        System.out.println("insert after second element");
        SinglyLinkedList.insertAfterNode(singlyLinkedList, singlyLinkedList.head.next, -37);
        SinglyLinkedList.print(singlyLinkedList);
        
        System.out.println("===============================");
        
        System.out.println("Delete from begining of linked list");
        SinglyLinkedList.DeleteFirstNode(singlyLinkedList);
        SinglyLinkedList.print(singlyLinkedList);
        
        System.out.println("===============================");
        
        System.out.println("Delete from the end of linked list");
        SinglyLinkedList.DeleteLastNode(singlyLinkedList);
        SinglyLinkedList.print(singlyLinkedList);
        
        System.out.println("===============================");
        
        System.out.println("Delete after specific node of linked list");
        SinglyLinkedList.DeleteAfterNode(singlyLinkedList, singlyLinkedList.head.next);
        SinglyLinkedList.print(singlyLinkedList);
        
        System.out.println("===============================");
        
        System.out.println("o-index linked list");
        System.out.println("Search for node in linked list");
        SinglyLinkedList.SearchForNode(singlyLinkedList, 9);
        SinglyLinkedList.print(singlyLinkedList);
    }
}
