package Assignments_3July2026;

public class BinarySearch {
    public static void main(String[] args) {
        int[]a={2,3,4,5,6};
        int key=5;
        int index=binarySearch(a,key);
        if(index==-1) System.out.println("Element not found");
        else System.out.println("Element found at index:"+index);
    }
    public static int binarySearch(int[]a,int key){
        int low=0,high=a.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(a[mid]==key){
                return mid;
            }else if(key>a[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}
