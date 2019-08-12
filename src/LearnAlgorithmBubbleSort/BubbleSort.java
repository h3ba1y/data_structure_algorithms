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
        
        for(int i=0;i<length-1;i++)
        {
            for (int j=0;j<length-i-1;j++){
                
                if(this.elementsArray[j] >  this.elementsArray[j+1]){
                    swapElement = this.elementsArray[j];
                    this.elementsArray[j] = this.elementsArray[j+1];
                    this.elementsArray[j+1] = swapElement;
                }
            }
            
        }
        
    }
    
}
