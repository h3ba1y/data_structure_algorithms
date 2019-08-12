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
public class QuickSort {
    
    private int[] elementsArray; //searchable array
    
    
    
    public void sortArray(int[]elementsArray, int minIndex,int maxIndex)
    {
        
        
        if(minIndex < maxIndex)
        {
            int pivotIndex = this.partition(elementsArray, minIndex, maxIndex);
            sortArray(elementsArray, minIndex, pivotIndex-1);
            sortArray(elementsArray, pivotIndex+1, maxIndex);
        }
        
        
    }
    
    private int partition(int[]elementsArray,int minIndex, int maxIndex)
    {
        int pivot = elementsArray[maxIndex];
        int i=minIndex-1;
        for (int j = minIndex; j < maxIndex; j++) {
           if (elementsArray[j] <= pivot) {
               i++;
               int swapTemp = elementsArray[i];
               elementsArray[i] = elementsArray[j];
               elementsArray[j] = swapTemp;
           }
       }
       int swapTemp = elementsArray[i+1];
        elementsArray[i+1] = elementsArray[maxIndex];
        elementsArray[maxIndex] = swapTemp;

        return i+1;
        
    }
    
    
}
