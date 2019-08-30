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
public class MaxMinInArray {
    public static void main(String[] args)
    {
    int[] nums = {10,23,530,5,60};
        int min=nums[0];
        int max=nums[0];
        for(int i = 1;i<nums.length;i++)
        {
            if( nums[i] >max ){
                max = nums[i];
            }else if(nums[i]<min){
              min = nums[i];
            }
        }
        
        System.out.printf("max is %d\n",max);
        System.out.printf("min is %d\n",min);
    }
}
    

