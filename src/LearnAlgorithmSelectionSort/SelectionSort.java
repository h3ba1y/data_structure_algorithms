/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LearnAlgorithmSelectionSort;

/**
 *
 * @author heba
 */
public class SelectionSort {
    
    private int[] elementsArray; //searchable array
    
    public SelectionSort setElementArray(int[] elementsArray){
        this.elementsArray = elementsArray;
        return this;
    }
    
    public int[] getElementArray(){
        return this.elementsArray;
    }
    
    public void sortArray()
    {
        int minimumIndex = 0;
        int length = (this.elementsArray).length;
        
        for(int i=0;i<length;i++)
        {
            minimumIndex = this.findIndexOfMinimum(i,this.elementsArray.length);
            this.swapElements(i, minimumIndex);
            
        }
        
    }
    
    private int findIndexOfMinimum(int i,int length)
    {
        int minimum = i;
        for(;i<length-1;i++){
            if(this.elementsArray[minimum] > this.elementsArray[i+1]){
                minimum = i+1;
            }
        }
        return minimum;
    }
    
    private void swapElements(int i, int minimumIndex)
    {
        int swap = this.elementsArray[i];
        this.elementsArray[i]=this.elementsArray[minimumIndex];
        this.elementsArray[minimumIndex]=swap;
    }
    
    
    
}
