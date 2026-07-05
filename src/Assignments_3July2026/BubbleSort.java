package Assignments_3July2026;

public class BubbleSort {
    public static void main(String[] args) {
        int[]a={3,4,2,1,5};
        bubbleSort(a);
        System.out.println("Elements after sorting:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void bubbleSort(int[]a){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            boolean swapped=false;
            for(int j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    swap(a,j,j+1);
                    swapped=true;
                }
            }
            if(!swapped) break;
        }
    }
    public static void swap(int[]a,int i1,int i2){
        int temp=a[i1];
        a[i1]=a[i2];
        a[i2]=temp;
    }
}
