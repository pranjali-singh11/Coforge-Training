package Assignments_3July2026;

public class LinearSearch {
    public static void main(String[] args) {
      int[]a={2,33,21,45,67,21};
      int key=33;
      int index=linearSearch(a,key);
      if(index==-1) System.out.println("Element not found");
      else System.out.println("Element found at index:"+index);
    }
    public static int linearSearch(int[]a,int key){
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                return i;
            }
        }
        return -1;
    }
}
