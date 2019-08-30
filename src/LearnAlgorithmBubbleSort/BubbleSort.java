/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LearnAlgorithmBubbleSort;


/**
 *
 * @author heba
 */
public class BubbleSort {
    
    private int[] elementsArray; //searchable array
    
    public BubbleSort setElementArray(int[] elementsArray){
        this.elementsArray = elementsArray;
        return this;
    }
    
    public int[] getElementArray(){
        return this.elementsArray;
    }
    
    public void sortArray()
    {
        int swapElement = -1;
        
        int length = (this.elementsArray).length;
        
        for(int i=0;i<length;i++)
        {
            for (int j=i+1;j<length;j++){
                if(this.elementsArray[i] >  this.elementsArray[j]){
                    swapElement = this.elementsArray[j];
                    this.elementsArray[j] = this.elementsArray[i];
                    this.elementsArray[i] = swapElement;
                }
            }
            
        }

    }
    
}
