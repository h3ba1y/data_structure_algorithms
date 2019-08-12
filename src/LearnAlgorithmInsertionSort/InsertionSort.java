/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LearnAlgorithmInsertionSort;

/**
 *
 * @author heba
 */
public class InsertionSort {
    private int[] elementsArray; //searchable array
    
    public InsertionSort setElementArray(int[] elementsArray){
        this.elementsArray = elementsArray;
        return this;
    }
    
    public int[] getElementArray(){
        return this.elementsArray;
    }
    
    public void sortArray()
    {
        int keyElement = -1;
        
        int length = (this.elementsArray).length;
        
        for(int i=1;i<length;i++)
        {
            int j=i;
            while (j>0 && (this.elementsArray[j-1] > this.elementsArray[j])){
                keyElement = this.elementsArray[j];
                if(this.elementsArray[j-1] > keyElement){
                    this.elementsArray[j] = this.elementsArray[j-1];
                    this.elementsArray[j-1] = keyElement;
                    j--;
                }
            }
            
        }
        
    }
}
