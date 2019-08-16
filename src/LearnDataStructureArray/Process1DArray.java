/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LearnDataStructureArray;

import java.util.Random;

/**
 *
 * @author hebatarek
 */
public class Process1DArray {
    
    public static void main(String[] args)
    {
        int arraySize = 3;
        int[]arr = new int[arraySize];
        
        setArrayElements(arr,arraySize);
        
        printElemnt(arr,arraySize);
        
    }
    
    private static void setArrayElements(int[] arr, int n)
    {
        for(int i=0;i<n;i++){
            arr[i] = i+5;
        }
    }
    
    private static void printElemnt(int[] arr, int n)
    {
        for(int i=0;i<n;i++){
            System.out.printf("element index = %d, element value =%d\n",i,arr[i]);
        }
    }
    
}
