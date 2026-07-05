package Assignments_3July2026;

public class InsertElement {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int pos = 3;      // 1-based
        int element=25;
        int[] result = insertElement(a, pos,element);
        System.out.println("Array after insertion:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public static int[] insertElement(int[]a,int pos,int element){
        int[] b = new int[a.length + 1];
        for(int i=0;i<pos-1;i++){
            b[i]=a[i];
        }
        b[pos-1]=element;
        for(int i=pos-1;i<a.length;i++){
            b[i+1]=a[i];
        }
        return b;
    }
}
