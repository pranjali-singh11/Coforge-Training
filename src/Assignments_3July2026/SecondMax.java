package Assignments_3July2026;

public class SecondMax {
    public static void main(String[] args) {
        int[]a={10,2,3,4,10};
        int secondMax=findSecondMax(a);
        if(secondMax==Integer.MIN_VALUE){
            System.out.println("Second max element doesn't exist");
        }else{
        System.out.println("Second Maximum element:"+secondMax);
        }
    }
    public static int findSecondMax(int[]a){
//        if (a.length < 2) {
//            System.out.println("Second max element does not exist");
//            return -1;
//        }
        int max=a[0];
        int secondMax=Integer.MIN_VALUE;
        for(int i=1;i<a.length;i++){
             if(a[i]>max){
                 secondMax=max;
                 max=a[i];
             }else if(a[i]>secondMax && a[i]!=max){
                 secondMax=a[i];
             }
        }
        return secondMax;
    }
}
