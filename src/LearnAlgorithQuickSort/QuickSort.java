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
    
    public QuickSort setElementArray(int[] elementsArray){
        this.elementsArray = elementsArray;
        return this;
    }
    
    public int[] getElementArray(){
        return this.elementsArray;
    }
    
    public void sortArray(int minIndex,int maxIndex)
    {
        
        
        if(minIndex < maxIndex)
        {
            int pivotIndex = this.partition(minIndex, maxIndex);
            sortArray(minIndex, pivotIndex-1);
            sortArray(pivotIndex+1, maxIndex);
        }
        
        
    }
    
    private int partition(int minIndex, int maxIndex)
    {
        int pivot = this.elementsArray[maxIndex];
        int i=minIndex-1;
        for (int j = minIndex; j < maxIndex; j++) {
           if (this.elementsArray[j] <= pivot) {
               i++;
               int swapTemp = this.elementsArray[i];
               this.elementsArray[i] = this.elementsArray[j];
               this.elementsArray[j] = swapTemp;
           }
       }
       int swapTemp = this.elementsArray[i+1];
        this.elementsArray[i+1] = this.elementsArray[maxIndex];
        this.elementsArray[maxIndex] = swapTemp;

        return i+1;
        
    }
    
    
}
