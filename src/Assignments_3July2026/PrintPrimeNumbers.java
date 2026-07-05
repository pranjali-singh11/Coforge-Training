package Assignments_3July2026;

public class PrintPrimeNumbers {
    public static void main(String[] args) {
        int[]a={1,2,4,5,6,7,8,12};
        System.out.print("Prime numbers are:");
        for(int i=0;i<a.length;i++){
            if(a[i]<=1){
                continue;
            }
            boolean isPrime=true;
            for(int j=2;j<a[i];j++){
                if(a[i] % j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime) System.out.print(a[i]+" ");
        }

    }
}
