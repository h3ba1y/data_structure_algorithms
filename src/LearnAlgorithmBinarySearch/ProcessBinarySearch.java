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
public class ProcessBinarySearch {
    
    public static void main(String[] args)
    {
        BinarySearch binarySearch = new BinarySearch();
        
        int[] searchableArray = new int[]{ 2,4,6,10,47,50,100 };
        
        binarySearch.setElementArray(searchableArray).setTargetValue(47);
        
        int index = binarySearch.findTargetValue();
        
        System.out.printf("index of target value %d is %d \n",new Object[] {47, index});
    }
    
}
