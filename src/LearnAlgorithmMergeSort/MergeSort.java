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
public class MergeSort {
    
    private int[] elementsArray; //searchable array
    
    public MergeSort setElementArray(int[] elementsArray){
        this.elementsArray = elementsArray;
        return this;
    }
    
    public int[] getElementArray(){
        return this.elementsArray;
    }
    
    public void sortArray(int minIndex,int maxIndex)
    {
        
        int middle = (minIndex+maxIndex)/2;
        
        if(minIndex < maxIndex)
        {
            this.sortArray(minIndex,middle);
            this.sortArray(middle+1,maxIndex);
            this.merge(minIndex,maxIndex,middle);
        }
        
        
    }
    
    private void merge(int minIndex, int maxIndex,int middleIndex)
    {
        int n1 = middleIndex - minIndex + 1;
        int n2 = maxIndex - middleIndex;
        int[] leftElements = new int[n1], rightElements = new int[n2];
        
        for(int i=0;i<n1;i++){
            leftElements[i]=this.elementsArray[minIndex+i];
        }
        
        for(int i=0;i<n2;i++){
            rightElements[i]=this.elementsArray[middleIndex+1+i];
        }
        int i=0 ,
            j=0 ,
            k=minIndex;
        while(i<n1 && j < n2){
            if(leftElements[i]<=rightElements[j]){
                this.elementsArray[k] = leftElements[i];
                i++;
            }else{
                this.elementsArray[k] = rightElements[j];
                j++;
            }
            k++;
        }
        
        while(i<n1){
            this.elementsArray[k] = leftElements[i];
            i++;
            k++;
        }
        
        while(j<n2){
            this.elementsArray[k] = rightElements[j];
            j++;
            k++;
        }
    }
    
}
