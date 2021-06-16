
package tugas04;

public class selectionsort {
    public static void selectionsort(int[] A) {
        int smallindex;
        int pass, j, n = A.length;
        int temp;
        
        // index of smallest in the sublist
        for (pass = 0; pass < n - 1; pass++){ // pass = 0; 0<4-T
            smallindex = pass; // 0
            for (j = pass = 1; j < n; j ++){  // j =1; 1 < 5 /j=2; 2<5
                if (A[j]< A [smallindex]){ //A[1]<A[0]-6<10-T  /A[2]<A[1]-8<6-F
                    smallindex = j; //1 /2
                }
                
            }
            //tukar nilai terkecil dengan array [pass]
            temp = A[pass]; //
            A[pass] = A[smallindex];
            A[smallindex] = temp;
        }
    }
    public static void tampil(int data[]){
        for(int i=0; i < data.length; i++){
            System.out.print(data[i]+ " ");
            
        }
        System.out.println();
    }
    public static void main (String [] args){
        int A[] = {25, 7, 9, 13, 3};
        selectionsort.tampil(A);
        selectionsort.selectionsort(A);
        selectionsort.tampil(A);
    }
    
}
