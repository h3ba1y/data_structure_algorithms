/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LearnAlgorithmBinarySearch;

/**
 *
 * @author heba
 */
public class BinarySearch {
    
    private int index; // index of desired value in the searchable array
    private int targetValue; // desired value to be found   
    private int[] elementsArray; //searchable array
    
    public BinarySearch(){
        this.index = -1; // intiate index of desired value to -1
    }
    
    
    public int getIndex(){
        return this.index;
    }
    
    public BinarySearch setTargetValue(int tragetValue){
        this.targetValue = tragetValue;
        return this;
    }
    
    public int getTargetValue(){
        return this.targetValue;
    }
    
    public BinarySearch setElementArray(int[] elementsArray){
        this.elementsArray = elementsArray;
        return this;
    }
    
    public int[] getElementArray(){
        return this.elementsArray;
    }
    
    
    public int findTargetValue()
    {
        int length = (this.elementsArray).length;
        
        int maxIndex = length-1;
        
        int minIndex = 0;
        
        int middleIndex = -1;
        
        while(maxIndex >= minIndex){
            
            middleIndex = (maxIndex+minIndex)/2;
            
            if(this.elementsArray[middleIndex] == this.targetValue)
            {
                this.index = middleIndex;
                return this.index;
                
            }else if(this.elementsArray[middleIndex] > this.targetValue)
            {
                maxIndex = middleIndex - 1;
            }else if(this.elementsArray[middleIndex] < this.targetValue)
            {
                minIndex = middleIndex + 1;
            }
            
        }
        
        return this.index;
    }
    
}
