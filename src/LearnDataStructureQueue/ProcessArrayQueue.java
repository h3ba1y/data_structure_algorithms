/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LearnDataStructureQueue;

/**
 *
 * @author hebatarek
 */
public class ProcessArrayQueue {
    
    public static void main(String[] args)
    {
        Integer[] arrayElemenets = new Integer[10];
        for(int i=1; i<= arrayElemenets.length;i++ ){
            ArrayQueue.enqueue(arrayElemenets,arrayElemenets.length,i);
        }
        
        System.out.println("enqueue elements to queue");
        
        for(int i=arrayElemenets.length; i>=1;i-- ){
            System.out.println("index="+i+" has element:"+arrayElemenets[i-1]);
        }
        
        
        ArrayQueue.dequeue(arrayElemenets,arrayElemenets.length);
        ArrayQueue.dequeue(arrayElemenets,arrayElemenets.length);
        System.out.println("dequeue element from stack");
        
        for(int i=arrayElemenets.length; i>= 1;i-- ){
            if(arrayElemenets[i-1]!=null){
                System.out.println("index="+i+"has element:"+arrayElemenets[i-1]);
            }
        }
     
    }
    
}
