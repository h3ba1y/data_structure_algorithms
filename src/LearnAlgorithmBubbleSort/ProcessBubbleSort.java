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
public class ProcessBubbleSort {
    
    public static void main(String[] args)
    {
        int[] elemetsArray = new int[]{ 20,4,60,10,470,50,16 };
        
        BubbleSort bubbleSort = new BubbleSort();
        
        bubbleSort.setElementArray(elemetsArray).sortArray();
        
        System.out.println("sorted Array elements ");
        for(int i =0 ;i<elemetsArray.length;i++)
        {
          System.out.println(elemetsArray[i]);
        }
        
    }
    
}
