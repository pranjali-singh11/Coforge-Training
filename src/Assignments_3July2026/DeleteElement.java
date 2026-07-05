package Assignments_3July2026;

public class DeleteElement {
    public static void main(String[] args) {
        int[]a={1,4,5,2,3,7};
        int index=6;
        if(index<0 || index>=a.length){
            System.out.println("Invalid index");
            return;
        }
        for(int i=index;i<a.length-1;i++){
            a[i]=a[i+1];
        }
        System.out.print("Array after deletion:");
        for(int i=0;i<a.length-1;i++){
            System.out.print(a[i]+" ");
        }
    }
}
