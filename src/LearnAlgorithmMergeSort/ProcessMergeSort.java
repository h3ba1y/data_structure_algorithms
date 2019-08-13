/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LearnAlgorithmMergeSort;

/**
 *
 * @author heba
 */
public class ProcessMergeSort {
    
    public static void main(String[] args)
    {
        int[] elementsArray = new int[]{ 20,4,60,10,470,50,16 };
        
        MergeSort mergeSort = new MergeSort();
        
        int maxIndex = elementsArray.length - 1;
        int minIndex = 0;
        
        mergeSort.setElementArray(elementsArray).sortArray(minIndex,maxIndex);
        
        System.out.println("sorted Array elements ");
        for(int i =0 ;i<elementsArray.length;i++)
        {
          System.out.println(elementsArray[i]);
        }
    }
    
}
