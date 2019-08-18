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
public class ArrayQueue {
    
    static int front;
    static int rear;
    
    public static void enqueue(Integer[] arrayElemenets,int arrayLength,int data)
    {
        
        if(front>-1 && front < rear && rear >= arrayLength){
             System.out.println("this stack is full");
             return;
        }else{
            System.out.println("data is enqueue");
            if(rear == front && front==-1){
                front++;
                rear++;
            }
            
            arrayElemenets[rear] = data;
        }
        rear++;
    }
    
    public static void dequeue(Integer[] arrayElemenets,Integer arrayLength)
    {
        if(rear == -1 && front == rear){
             System.out.println("this stack is empty");
        }else{
            System.out.println("this is dequeued");
            arrayElemenets[front] = null;
            front++;
            if(rear < front || front>=arrayLength){
                front = -1;
                rear  = -1;
            }
        }
    }
    
}
