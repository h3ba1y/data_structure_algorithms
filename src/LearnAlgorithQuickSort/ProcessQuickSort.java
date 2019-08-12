/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LearnAlgorithQuickSort;

/**
 *
 * @author heba
 */
public class ProcessQuickSort {
    
    public static void main(String[] args)
    {
        int[] elementsArray = new int[]{ 20,4,60,10,470,50,16 };
        
        QuickSort quickSort = new QuickSort();
        
        int maxIndex = elementsArray.length - 1;
        int minIndex = 0;
        
        quickSort.setElementArray(elementsArray).sortArray(minIndex,maxIndex);
        
        System.out.println("sorted Array elements ");
        for(int i =0 ;i<elementsArray.length;i++)
        {
          System.out.println(elementsArray[i]);
        }
    }
    
}
