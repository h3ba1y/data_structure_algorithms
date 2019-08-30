/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LearnDataStructureTasks;

/**
 *
 * @author hebatarek
 */
public class QuickSort {
    
    public static void main(String[] args){
        int[] nums = {530,1,23,5,60};
        quickSort(nums,0, nums.length-1);
         for(int i:nums){
            System.out.println(i);
        }
    }
    
    public static void quickSort(int[] arr,int low, int high)
    {
        
        int i =low, j = high;
        
        int pivot = (i+j)/2;
        
        while(i<=j){
            if(arr[i]<arr[pivot]){
                i++;
            }else if(arr[j]>arr[pivot]){
                j--;
            }
            if(i<=j){
                swap(arr,i,j);
                i++;
                j--;
            }
            
            if(i<high){
                quickSort(arr,i, high);
            }
            if(j>low){
                quickSort(arr,low, j);
            }
        }
        
    }

    public static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
}

