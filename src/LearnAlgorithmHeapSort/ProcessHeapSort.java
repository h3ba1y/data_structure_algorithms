/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LearnAlgorithmHeapSort;

/**
 *
 * @author heba
 */
public class ProcessHeapSort {
    
    public static void main(String[] args)
    {
        int[] elementsArray = new int[]{ 20,4,60,10,470,50,16 };
        
        HeapSort heapSort = new HeapSort();
        
        heapSort.setElementArray(elementsArray).sortArray();
        
        System.out.println("sorted Array elements ");
        for(int i =0 ;i<elementsArray.length;i++)
        {
          System.out.println(elementsArray[i]);
        }
    }
    
}
