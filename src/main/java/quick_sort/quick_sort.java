
package quick_sort;

public class quick_sort {
    private static int partition(int [] A, int p, int r){
        int i, j;
        double pivot;
        
        pivot = A[p];
        i = p- 1;
        j = r + 1;
        for (;;){
            do {
                i++;
            }
            while (A[i]< pivot);
            do {
                j--;
            } while (A[j]>pivot);
            if (i < j){
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            } else {
                return j;
                
            }
        }
    }
    
    public static void quick_sort (double [] A, int p, int r){
        int q;
        if (p< r){
            q = partition(A,p,r);
            quick_sort (A,p,q);
            quick_sort (A,q+1,r);
        }
        
    }
    public static void tampil (double data[]){
        for (int i= 0; i<data.length;i++)
            System.out.print(data[i]+" ");
        System.out.println();
    }
    public static void main (String[] args){
        double A[] = {12, 35, 9, 11, 3, 17, 23, 15, 31, 20};
        quick_sort.tampil(A);
        quick_sort.quick_sort(A, 0, A.length-1);
        quick_sort.tampil(A);
        }

    private static int partition(double[] A, int p, int r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
    

