import java.util.Random;

public class SelectionSort {
    //SelectionSort([A0..n-1])
    //Sorts a given array by selection sort
    //Input: An array A[0..n-1] of orderable elements
    //Output: Array A[0..n-1] sorted in ascending order

    public static void selectionSort(int[] arr){
        int min, i, j;
        int swap = 0;

        for(i = 0; i < arr.length - 1; i++){
            min = i;
            for(j = i + 1; j < arr.length; j++){
                // Find minimum
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            // Swap (Below not part of algorithm for analysis)
            swap(arr, min, i);
            // Count number of swaps
            swap++;

            // Print array
            printNums(arr, i, min);
        }
        System.out.println("\n\nTotal swaps: " + swap);
    }

    // Swap out smallest
    public static int[] swap(int[] arr, int min, int i){
        int temp = 0;
        // Swap
        temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;

        // Return swapped array
        return arr;
    }

    // Print the array
    public static void printNums(int[] arr, int i, int min){
        //Print array
        System.out.print("\nPass " + (i+1) + ": ");
        for(int k = 0; k < arr.length; k++){
            // Check for swapped numbers
            if(k == i || k == min){
                System.out.print("[" + arr[k] + "] ");
            }
            else {
                System.out.print(arr[k] + " ");
            }
        }
    }

    // Generate an array of random numbers
    public static int[] randNums(){
        int[] randomArr = new int[25];
        Random rand = new Random();
        int rNum;

        for (int i = 0; i < randomArr.length; i++){
            rNum = rand.nextInt(99);
            randomArr[i] = rNum;
        }
        // Return the array
        return randomArr;
    }

    public static void main (String [] args){
    // Fill array with randomNums function
    int[] unsortedArr = randNums();

    // Print initial array
    System.out.print("\nUnsorted Array: ");
    for(int l = 0; l < unsortedArr.length; l++){
        System.out.print(unsortedArr[l] + " ");
    }
    System.out.println();

    // Call selection sort
    selectionSort(unsortedArr);
    }
}


