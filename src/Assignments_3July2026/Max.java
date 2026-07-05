package Assignments_3July2026;

public class Max {
    public static void main(String[] args) {
        int[]a={10,12,61,10,32};
        int max=findMax(a);
        System.out.println("Maximum element:"+max);
    }
    public static int findMax(int[]a){
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
}
