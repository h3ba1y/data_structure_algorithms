/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LearnDataStructureStack;

import com.sun.xml.internal.bind.v2.model.util.ArrayInfoUtil;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author hebatarek
 */
public class ArrayStack {
    
    private static int top = -1;
    
    
    public static void push(Integer[] arrayElemenets,int arrayLength,int data)
    {
        
        if(top == arrayLength){
             System.out.println("this stack is full");
             return;
        }else{
            System.out.println("data is pushed");
            top++;
        }
        
        arrayElemenets[top] = data;
    }
    
    public static void pop(Integer[] arrayElemenets,Integer arrayLength)
    {
        if(top == -1){
             System.out.println("this stack is empty");
        }else{
            System.out.println("this is poped");
            arrayElemenets[top] = null;
            top--;
        }
    }
    
    public static Integer peek(Integer[] arrayElemenets,Integer arrayLength)
    {
        int val = -1;
        if(top == -1){
             System.out.println("this stack is empty");
        }else{
            System.out.println("this is poped");
            val = arrayElemenets[top];
            top--;
        }
        
        return val;
    }
    
}
