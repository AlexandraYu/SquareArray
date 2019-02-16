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
                    // swap A[j+1] and arr[i] 
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
        int[] array = {-1, 5, -6, 9, 10, 12, 11, -10}; 
        sortedSquares(array);
        for (int i=0; i<array.length; i++) {
            System.out.println(array[i]+" ");
        }
    }
}
