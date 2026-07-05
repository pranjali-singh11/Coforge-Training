package Assignments_3July2026;

public class InsertionSort {
    public static void main(String[] args) {
        int[]a={3,4,2,1,5};
        insertionSort(a);
        System.out.println("Elements after sorting:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void insertionSort(int[]a){
        int n=a.length;
        for(int i=1;i<n;i++){
            int j=i-1;
            int num=a[i];
            while(j>=0 && a[j]>num){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=num;
        }
    }
}
