/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LearnAlgorithmLinearSearch;

/**
 *
 * @author heba
 */
public class LinearSearch {
    
    private int index; // index of desired value in the searchable array
    private int targetValue; // desired value to be found   
    private int[] elementsArray; //searchable array
    
    public LinearSearch(){
        this.index = -1; // intiate index of desired value to -1
    }
    
    
    public int getIndex(){
        return this.index;
    }
    
    public LinearSearch setTargetValue(int tragetValue){
        this.targetValue = tragetValue;
        return this;
    }
    
    public int getTargetValue(){
        return this.targetValue;
    }
    
    public LinearSearch setElementArray(int[] elementsArray){
        this.elementsArray = elementsArray;
        return this;
    }
    
    public int[] getElementArray(){
        return this.elementsArray;
    }
    
    
    public int findTargetValue()
    {
        int length = (this.elementsArray).length;
        
        for(int i=0;i<length;i++){
            if(this.elementsArray[i] == this.targetValue){
                this.index = i;
                return this.index;
            }
        }
        
        return this.index;
    }
    
}
