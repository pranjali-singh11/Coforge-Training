package Assignments_3July2026;
public class SelectionSort {
    public static void main(String[] args) {
        int[]a={3,4,2,1,5};
        selectionSort(a);
        System.out.println("Elements after sorting:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void selectionSort(int[]a){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            if(i!=min){
                swap(a,i,min);
            }
        }
    }
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
