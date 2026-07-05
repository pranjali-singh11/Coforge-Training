package Assignments_3July2026;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 5, 3};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void mergeSort(int[]a,int lb,int ub){
        if(lb<ub){
            int mid=lb+(ub-lb)/2;
            mergeSort(a,lb,mid);
            mergeSort(a,mid+1,ub);
            merge(a,lb,mid,ub);
        }
    }
    public static void merge(int[]a,int lb,int mid,int ub){
        int[]b=new int[ub-lb+1];
        int i=lb,j=mid+1,k=0;
        while(i<=mid && j<=ub){
            if(a[i]<=a[j]){  // <= makes Merge Sort stable
                b[k++]=a[i++];
            }else{
                b[k++]=a[j++];
            }
        }
        while(i<=mid){
            b[k++]=a[i++];
        }
        while(j<=ub){
            b[k++]=a[j++];
        }
        for(i=lb,k=0;i<=ub;i++,k++){
            a[i]=b[k];
        }
    }

}
