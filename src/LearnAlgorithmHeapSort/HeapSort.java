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
public class HeapSort {
    
    private int[] elementsArray; //searchable array
    
    public HeapSort setElementArray(int[] elementsArray){
        this.elementsArray = elementsArray;
        return this;
    }
    
    public int[] getElementArray(){
        return this.elementsArray;
    }
    
    public void sortArray()
    {
        int n = this.elementsArray.length;
        
        this.buildHeap(n);
        
        for(int i = n-1;i>=0;i--){
            this.swap(i,0);
            this.heapify(i,0);
        }
        
        
    }
    
    private void buildHeap(int n)
    {
        int n1 = n/2-1;
        for(int i = n1;i>=0;i--){
            this.heapify(n,i);
        }
    }
    
    private void heapify(int n,int i)
    {
        int left = 2 * i + 1;
        int right = 2* i + 2;
        int max = i;
        
        if ((left < n) && (this.elementsArray[left] > this.elementsArray[max])){
            max = left;
        }
        
        if ((right<n) && (this.elementsArray[right] > this.elementsArray[max])){
            max = right;
        }

        if (max != i ){
            this.swap(i,max);
            this.heapify(n,max);
        }
    }
    
    private void swap(int i, int j){
        int swap = this.elementsArray[j];
        this.elementsArray[j] = this.elementsArray[i];
        this.elementsArray[i] = swap;
    }
    
}
