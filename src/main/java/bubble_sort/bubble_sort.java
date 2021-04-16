
package bubble_sort;
public class bubble_sort {
    public static void bubblesort (int[]A){
        int i = 1, j, n = A.length;
        int temp;
        while (i<n){
            j = n -1 ;
            while (j>= i){
                if (A[j-1]>A[j]){
                    temp = A[j];
                    A[j] = A[j-1];
                    A[j-1] = temp;
                }
                j = j -1;
                
            }
            i = i + 1;
        }
    }
    public static void tampil (int data []){
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i] + "");
        }
        System.out.println();
    }
    public static void main (String [] args){
        int A[] = {10, 6, 8, 3, 1};
        bubble_sort.tampil(A);
        bubble_sort.bubblesort(A);
        bubble_sort.tampil(A);
    
}
}
