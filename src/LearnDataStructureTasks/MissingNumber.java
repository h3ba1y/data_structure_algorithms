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
public class MissingNumber {
    
    public static void main(String[] args)
    {
        int[] nums = {1,2,3,5,6,7,8,9};
        int n=9;
        int realSum =(int)(n*((n+1)/2.0));
        int actualSum=0;
        for(int i : nums)
        {
            actualSum+=i;
        }
        System.out.printf("real sum is %d\n",(realSum));
        System.out.printf("actual sum is %d\n",(actualSum));
        System.out.printf("missing number is %d\n",(realSum-actualSum));
    }
    
}
