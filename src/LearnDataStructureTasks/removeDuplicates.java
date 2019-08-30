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
public class removeDuplicates {
    public static void main(String[] args)
    {
        int[] nums = {1,1,1,2,2,2,2,3,3,5,5,5,6,6,6,7,7};
        
        int prev =nums[0];
        int[] temp=new int[nums.length];
        temp[0]=prev;
        
        
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=prev)
            {
                prev = nums[i];
                temp[i]=nums[i];
                
            }
        }
        
        for(int i:temp){
            System.out.println(i);
        }
        
    }
}
