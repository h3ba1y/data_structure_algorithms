/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LearnDataStructureStack;

/**
 *
 * @author hebatarek
 */
public class ProcessArrayStack {
    
    public static void main(String[] args)
    {
        Integer[] arrayElemenets = new Integer[10];
        for(int i=1; i<= arrayElemenets.length;i++ ){
            ArrayStack.push(arrayElemenets,arrayElemenets.length,i);
        }
        
        System.out.println("Push elements to stack");
        
        for(int i=arrayElemenets.length; i>=1;i-- ){
            System.out.println("index="+i+" has element:"+arrayElemenets[i-1]);
        }
        
        
        ArrayStack.pop(arrayElemenets,arrayElemenets.length);
        ArrayStack.pop(arrayElemenets,arrayElemenets.length);
        System.out.println("Pop element from stack");
        
        for(int i=arrayElemenets.length; i>= 1;i-- ){
            if(arrayElemenets[i-1]!=null){
                System.out.println("index="+i+"has element:"+arrayElemenets[i-1]);
            }
        }
        
        
        System.out.println("Peek element from stack");
        System.out.println("elemenet returned from peek: "+ArrayStack.peek(arrayElemenets,arrayElemenets.length));
        
        for(int i=arrayElemenets.length; i>= 1;i-- ){
            if(arrayElemenets[i-1]!=null){
                System.out.println("index="+i+"has element:"+arrayElemenets[i-1]);
            }
        }
    }
    
}
