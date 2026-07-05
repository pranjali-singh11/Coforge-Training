package Assignments_3July2026;

public class Merge2Arrays {
    public static void main(String[] args) {
        int[] a = {3, 1, 5};
        int[] b = {4, 2, 6};
        int[] c = new int[a.length + b.length];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            c[k++] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[k++] = b[i];
        }
        MergeSort.mergeSort(c,0,c.length-1);
        System.out.println("Sorted Merged array:");
        for(int i:c){
            System.out.print(i+" ");
        }
    }
}
