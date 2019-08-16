package LearnDataStructureArray;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hebatarek
 */
public class Process2DArray {
    public static void main(String[] args)
    {
        int rowSize = 3;
        int columnSize = 5;
        int[][] arr = new int[rowSize][columnSize];
        
        setArrayElements(arr,rowSize,columnSize);
        
        printElemnt(arr,rowSize,columnSize);
        
    }
    
    private static void setArrayElements(int[][] arr,int r, int n)
    {
        for(int i=0;i<r;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = j*i+5;
            }
        }
    }
    
    private static void printElemnt(int[][] arr, int r, int n)
    {
        for(int i=0;i<r;i++){
            for(int j=0;j<n;j++){
                System.out.printf("element row index = %d, element column index = %d , element value =%d\n",i,j,arr[i][j]);
            }
        }
    }
}
