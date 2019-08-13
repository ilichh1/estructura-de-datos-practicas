/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quicksort;

/**
 *
 * @author ilichh1
 */
public class QuicksortMain {
    
    /*
    public static int[] unorderedList = new int[] {
        5,6,7,0,1,10,8,9,2,3
    };
    */
    public static int recursiveCalls = 0;
    public static int actualFunctions = 0;
    
    public static void main(String args[]) {
        int[] unorderedList = generateRandomList(10);
        System.out.println("ORDENAR: ");
        System.out.println(arrayToString(unorderedList));
        
        quickSort(unorderedList, 0, unorderedList.length - 1);
        System.out.println("Resultado: ");
        System.out.println(arrayToString(unorderedList));
        System.out.println("Recursive calls: " + recursiveCalls);
        System.out.println("Times executed: " + actualFunctions);
    }
    
    public static void quickSort(int[] array, int begin, int end) {
        recursiveCalls++;
        System.out.println("QUICKSORT. Begin: " + begin + ", End: " + end);
        if (begin < end) {
            actualFunctions++;
            int partitionIndex = partition(array, begin, end);

            quickSort(array, begin, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, end);
        }
    }
    
    private static int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        System.out.println("Pivote: " + pivot);
        
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            System.out.println("Comparando " + arr[j] + " con " + pivot);
            if (arr[j] <= pivot) {
                System.out.println("SWAPING VALUES!!!");
                i++;
                System.out.println("Moviendo idx " + i + " al idx " + j);
                System.out.println(arr[i] + " -> " + arr[i]);
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        
        System.out.println("Moviendo el idx " + (i+1) + " al idx " + end);
        System.out.println(arr[i+1] + " -> " + arr[end]);
        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;
        
        System.out.println("Regresando: " + (i+1));
        return i+1;
    }
    
    private static String arrayToString(int[] array) {
        String returnValue = "";
        for (int i : array) {
            returnValue += i + ", ";
        }
        return returnValue;
    }
    
    private static  int[] generateRandomList(int listSize) {
        int[] generatedList = new int[listSize];
        
        for (int i = 0; i < listSize; i++) {
            generatedList[i] = (int) (Math.random() * listSize);
        }
        
        return generatedList;
    }
    
}
