import java.lang.Math; 

public class SquareArray{
    
    public static int[] sortedSquares(int[] A) {
        A = bubbleSortArray(A); 
        for (int i=0; i<A.length; i++) {
            A[i] = A[i]*A[i]; 
        }
        return A; 
    }

    private static int[] bubbleSortArray(int[] A){ //this is bubble sort with O(n^2) performance
        int temp = 0; 
        for (int i = 0; i < A.length; i++) { 
            for (int j = 0; j < A.length-i-1; j++) { 
                if (Math.abs(A[j]) > Math.abs(A[j+1])) 
                { 
                    // swap A[j+1] and A[j] 
                    temp = A[j]; 
                    A[j] = A[j+1]; 
                    A[j+1] = temp; 
                } 
            }
        }
        for (int i=0; i<A.length; i++) {
            System.out.print(A[i]+" ");
        }
        return A; 
    }
    public static void main(String []args){
        int[] array = {-10, -5, -1, 3, 5, 12, 14}; 
        sortedSquares(array);
        for (int i=0; i<array.length; i++) {
            System.out.println(array[i]+" ");
        }
    }
    //There's actually another way to do it, with much better O(n) performance. The point is that the starting array is ***sorted*** in non descending order
    //Remember, the smallest negative number will become biggest positive number when squared, since the array given is sorted in non descending order,
    //that means you can compare "head" and "tail" elements in an array and decide which to put in the "solution array" first.  
    public static int[] sortSquareArray(int[] A) {
         int n = A.length; 
         int[] solution = new int[n];
         int i=0, j=n-1; 
         int tmp = 0; 
         for(int count=n-1; count>=0; count--){
             if (Math.abs(A[i]) > Math.abs(A[j])) {
                 solution[count] = A[i]*A[i];
                 i++; 
             }
             else {
                 solution[count] = A[j]*A[j]; 
                 j--; 
             }
         }
         return solution;
     }
}
