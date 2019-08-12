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
public class ProcessLinearSearch {
    
    public static void main(String[] args)
    {
        LinearSearch linearSearch = new LinearSearch();
        int[] searchableArray = new int[]{ 10,2,5,4,50,6,47,8,9,100 };
        linearSearch.setElementArray(searchableArray).setTargetValue(47);
        
        int index = linearSearch.findTargetValue();
        
        System.out.printf("index of target value %d is %d \n",new Object[] {47, index});
        
    }
    
}
