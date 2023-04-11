/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExerciciosJava_CapGemini.helpers;

/**
 *
 * @author Juca
 */
public class SortingAlgorithms {
    
    public static int[] createArray(int positions){
        
        int[] arr = new int[positions];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = RandomNumberProvider.RandomSingleNumberCreator(100);
            System.out.println("Create Array element is: " + arr[i]);      
        }
        return arr;
    }
    
    
    
    public static void ArrayIndexSwap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static int[] QuikSort(int arr[], int left, int right){
        
        if (left < right){
           int pivotIndex = partition(arr, left, right );
           QuikSort(arr, left, pivotIndex - 1);
           QuikSort(arr, pivotIndex + 1, right);
        }
        

        return arr;
    }
    
    public static int partition(int arr[], int left, int right){
        int pivot = arr[left];
        int i = left + 1;
        int j = right;
        
        for( int k = i; k <= j; k++){
            if(arr[k] < pivot){
                
                int tmp = arr[k];
                arr[k] = arr[i];
                arr[i] = tmp;
                i++;
            }
            
        }
        
        int temp = arr[left];
        arr[left] = arr[i - 1];
        arr[i - 1] = temp;

        
        return (i - 1);
    }
}
